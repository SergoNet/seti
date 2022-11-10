package ru.nsu.netesov.tcp.model;

import java.io.Serializable;

public class FileInfo implements Serializable {
    private final String fileName;
    private final long fileSizeInBytes;

    public FileInfo(String fileName, long fileSizeInBytes) {
        this.fileName = fileName;
        this.fileSizeInBytes = fileSizeInBytes;
    }
    public String getFileName() {
        return fileName;
    }
    public long getFileSizeInBytes() {
        return fileSizeInBytes;
    }
}