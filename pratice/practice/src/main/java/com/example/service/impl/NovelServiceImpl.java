package com.example.service.impl;

import com.example.Mapper.NovelMapper;
import com.example.pojo.Novel;
import com.example.service.NovelService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NovelServiceImpl implements NovelService {
    @Autowired
    private NovelMapper novelMapper;
    @Override
    public List<Novel> list(String qdClass,String qdName){
        return novelMapper.list(qdClass,qdName);
    }

//    @Override
//    public List<Novel> getByQdClass(String qdClass) {
//        return novelMapper.getByQdClass(qdClass);
//    }

}
