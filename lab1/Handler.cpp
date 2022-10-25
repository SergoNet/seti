#include "Handler.h"

#include <utility>
#include <iostream>

using namespace boost::asio;
using namespace std::chrono;

Handler::Handler(io_context &io_context,std::string  message):
    deadl_timer(io_context),token_(std::move(message)),copies(std::map<std::string, time_pointer>()) {
    deadl_timer.expires_from_now(boost::posix_time::seconds(1));
    deadl_timer.async_wait([this](boost::system::error_code exception) {
                if (!exception) {
                    remove_the_dead();
                }
    });
}

void Handler::handle_mes(const std::string &message, const std::string& addr) {
    if (message != token_) exit(1);
    copies[addr] = system_clock::now();
    if (copies.find(addr) == copies.end()) {
        for (const auto& copi : copies) {
            std::cout << copi.first << std::endl;
        }
    }
}

void Handler::remove_the_dead() {
    bool update = false;
    if (checking_for_updates(update)) {
        for (const auto& copi : copies) {
            std::cout << copi.first << std::endl;
        }
    }
    deadl_timer.expires_from_now(boost::posix_time::seconds(1));
    deadl_timer.async_wait([this](boost::system::error_code exception) {
                if (!exception) {
                    remove_the_dead();
                }
    });
}

bool checking_for_updates(tmp) {
    for (auto i = replicas_.cbegin(); i != replicas_.cend(); ) {
        auto last_update = i->second;
        auto diff = duration_cast<seconds>(
                system_clock::now().time_since_epoch() - last_update.time_since_epoch());
        if (diff.count() > 3) {
            tmp = true;
            replicas_.erase(i++);
        } else {
            ++i;
        }
    }
    return tmp;
}

