package ru.nsu.netesov.Services;

import ru.nsu.netesov.model.Data;

import java.io.IOException;

public interface Finder {
    void find(Data data) throws IOException;
}
