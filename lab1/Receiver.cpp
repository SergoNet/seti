#include "Receiver.h"

using namespace boost::asio;

Receiver::Receiver(io_context& io_context,const ip::address& listen_addr,const ip::address& mul_addr,
                   short mul_port, Handler* handler):
                        socket(io_context),data(std::array<char, 1024>()),event_handler(handler) {
    ip::udp::endpoint listen_endpoint(listen_addr, mul_port);
    socket.open(listen_endpoint.protocol());
    socket.set_option(ip::udp::socket::reuse_address(true));
    socket.bind(listen_endpoint);
    socket.set_option(ip::multicast::join_group(mul_addr));
    receive();
}

void Receiver::receive() {
    socket.async_receive_from(buffer(array), sender_endpoint,
            [this](boost::system::error_code exception, std::streamsize length) {
                if (!exception) {
                    event_handler->handle_mes(array.data(),sender_endpoint.address().to_string());
                    receive();
                }
    });
}
