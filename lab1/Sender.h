#ifndef LAB1_SENDER_H
#define LAB1_SENDER_H
#include <iostream>
#include <sstream>
#include <string>
#include <boost/asio.hpp>

using namespace boost::asio;

class Sender {
public:
    Sender(io_context &io_context, const ip::address &mul_addr, short mul_port, std::string message );

private:
    void send();

    ip::udp::endpoint endpoint;
    ip::udp::socket socket;
    deadline_timer deadl_timer;
    std::string token;
};
#endif
