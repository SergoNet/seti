package ru.nsu.netesov.tcp.model;

import java.io.Serializable;

public class FileContent implements Serializable {
    private byte[] content;
    private long sizeInBytes;

    public FileContent(byte[] content) {
        this.content = content;
        sizeInBytes = content.length;
    }
    public byte[] getContent() {
        return content;
    }
    public long getSizeInBytes() {
        return sizeInBytes;
    }
}