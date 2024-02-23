package com.example.service.impl;

import com.example.Mapper.ReaderMapper;
import com.example.pojo.Reader;
import com.example.service.ReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReaderServiceImpl implements ReaderService {
    @Autowired
    private ReaderMapper readerMapper;
    @Override
    public Reader login(Reader reader) {
        return readerMapper.getByUsernameAndPassword(reader);
    }

    @Override
    public void save(Reader reader) {
        readerMapper.save(reader);
    }

    @Override
    public void update(Reader reader) {
        readerMapper.update(reader);
    }
}
