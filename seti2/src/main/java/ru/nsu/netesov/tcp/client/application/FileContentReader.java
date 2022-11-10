package ru.nsu.netesov.tcp.client.application;

import ru.nsu.netesov.tcp.model.FileContent;

import java.io.IOException;

public interface FileContentReader {
    boolean hasNextContent();
    FileContent read() throws IOException;
}