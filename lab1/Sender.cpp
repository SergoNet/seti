#include "Sender.h"

using namespace boost::asio;

Sender::Sender(io_context &io_context, const ip::address &mul_addr, short mul_port, std::string message) :
            endpoint(mul_addr, mul_port),socket(io_context, endpoint.protocol()),deadl_timer(io_context),token(std::move(message)) {
            send();
}

void Sender::send() {
    socket.async_send_to(buffer(token), endpoint, [this](boost::system::error_code exception, std::size_t /*len*/) {
        if (!exception) {
            deadl_timer.expires_from_now(boost::posix_time::seconds(1));
            deadl_timer.async_wait([this](boost::system::error_code excep) {
                if (!excep) {
                    send();
                }
            });
        }
    });
}

