package com.example.service;


import com.example.Mapper.NovelMapper;
import com.example.pojo.Novel;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface NovelService {

    List<Novel> list(String qdClass,String qdName);

//    List<Novel> getByQdClass(String qdClass);
}
