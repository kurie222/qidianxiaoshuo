package com.example.Mapper;

import com.example.pojo.Novel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface NovelMapper {
    //@Select("select * from qd_novel")
    List<Novel> list(String qdClass,String qdName);
//    @Select("select * from qd_novel where qd_class=#{qdClass}")
//    List<Novel> getByQdClass(String qdClass);
}
