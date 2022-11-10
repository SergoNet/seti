#ifndef LAB1_HANDLER_H
#define LAb1_HANDLER_H

#include <boost/asio.hpp>
#include <string>
#include <map>
#include <chrono>

using namespace boost::asio;
using namespace std::chrono;

typedef time_point<system_clock, system_clock::duration> time_pointer;

class Handler {
public:
    explicit Handler(io_context &io_context, std::string message);
    void handle_mes(const std::string &message, const std::string& addr);

private:
    void remove_the_dead();
    bool checking_for_updates(bool tmp);

    deadline_timer deadl_timer;
    std::string token_;
    std::map<std::string, time_pointer> copies;
};
#endif
