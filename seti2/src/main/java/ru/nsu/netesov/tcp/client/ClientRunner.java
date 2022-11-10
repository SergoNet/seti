package ru.nsu.netesov.tcp.client;

import ru.nsu.netesov.tcp.client.application.FileSender;
import ru.nsu.netesov.tcp.model.InetAddress;

public class ClientRunner {
    public static void main(String[] args) {
        InetAddress address = new InetAddress("127.2.0.245",23333);
        FileSender fileSender = new FileSender("src/main/resources/a.txt",address);
        fileSender.startConnection();
    }
}