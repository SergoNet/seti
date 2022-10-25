#include <iostream>
#include <string>
#include <stdlib.h>
#include <boost/asio.hpp>
#include <boost/lexical_cast.hpp>

#include "Sender.h"
#include "Receiver.h"
#include "Handler.h"
#include "CheckingArgs.h"

using namespace boost::asio;
const std::string message = "live";

int main (int argc, char* argv[]) {
    io_context io_context;
    CheckingArgs checkingArgs;
    if (!checkingArgs.check_args(argc, argv)) {
        std::cerr << "Invalid arguments" << std::endl;
        exit(1);
    }
    Handler handler(io_context, message);
    Sender sender(io_context, checkingArgs.get_mul_addr(), checkingArgs.get_port(), message);
    Receiver receiver(io_context, ip::make_address("0.0.0.0"), checkingArgs.get_mul_addr(), checkingArgs.get_port(), &handler);
    io_context.run();
    return 0;
}