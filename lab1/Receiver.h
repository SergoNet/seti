#ifndef LAB1_RECEIVER_H
#define LAB1_RECEIVER_H
#include "Handler.h"
#include <array>
#include <iostream>
#include <string>
#include <boost/asio.hpp>

using namespace boost::asio;

class Receiver {
public:
    Receiver(io_context& io_context, const ip::address& listen_addr, const ip::address& mul_addr,
             short mul_port, Handler* handler );

private:
    void receive();

    ip::udp::socket socket;
    ip::udp::endpoint sender_endpoint;
    std::array<char, 1024> array;
    Handler* event_handler;
};
#endif
