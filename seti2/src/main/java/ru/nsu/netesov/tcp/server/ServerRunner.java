package ru.nsu.netesov.tcp.server;

import ru.nsu.netesov.tcp.server.application.FileReceiverServer;

import java.util.Scanner;

public class ServerRunner {
    public static void main(String[] args) {
        FileReceiverServer server = new FileReceiverServer(23333);
        server.setDaemon(true);
        server.start();
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {}
    }
}