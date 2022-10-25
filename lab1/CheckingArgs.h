#ifndef LAB1_CHECKINGARGS_H
#define LAB1_CHECKINGARGS_H

#include <boost/asio.hpp>
#include <boost/lexical_cast.hpp>
#include <string>

using namespace boost::asio;

class CheckingArgs {
public:
    bool check_args(int argc, char **argv) {
        if (argc < 3 || argc > 4) {
            return false;
        } else {
            mul_addr = ip::make_address(argv[1]);
            port = boost::lexical_cast<short>(argv[2]);
            return true;
        }
    }

    const auto &get_mul_addr() const {
        return mul_addr;
    }

    const auto &get_port() const {
        return port;
    }

private:
    auto mul_addr;
    auto port;
}
#endif
