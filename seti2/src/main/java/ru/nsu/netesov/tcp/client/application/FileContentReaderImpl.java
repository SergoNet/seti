package ru.nsu.netesov.tcp.client.application;

import ru.nsu.netesov.tcp.model.FileContent;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

public class FileContentReaderImpl implements FileContentReader {
    private int bufferSize = 500;
    private Path pathOfFile;
    private boolean streamIsOpened = false;
    private boolean hasContent = true;
    private BufferedReader reader;

    public FileContentReaderImpl(Path pathOfFile) {
        this.pathOfFile = pathOfFile;
    }

    @Override
    public boolean hasNextContent() { return hasContent; }

    @Override
    public FileContent read() throws IOException {
        checkThatStreamIsOpened();
        int countOfSymbols;
        char[] buffer = new char[bufferSize];
        countOfSymbols  = reader.read(buffer);
        if (countOfSymbols < bufferSize) {
            buffer = Arrays.copyOf(buffer,countOfSymbols);
            hasContent = false;
            reader.close();
        }
        return new FileContent(charsToBytes(buffer));
    }
    private byte[] charsToBytes(char[] chars){
        Charset charset = StandardCharsets.UTF_8;
        ByteBuffer byteBuffer = charset.encode(CharBuffer.wrap(chars));
        return Arrays.copyOf(byteBuffer.array(), byteBuffer.limit());
    }

    private void checkThatStreamIsOpened() throws IOException {
        if (!streamIsOpened) {
            reader = new BufferedReader(new InputStreamReader(Files.newInputStream(pathOfFile, StandardOpenOption.READ)));
            streamIsOpened = true;
        }
    }
}