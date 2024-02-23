package com.example.service;

import com.example.pojo.Reader;

public interface ReaderService {
    Reader login(Reader reader);

    void save(Reader reader);

    void update(Reader reader);
}
