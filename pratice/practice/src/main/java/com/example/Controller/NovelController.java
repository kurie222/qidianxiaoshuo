package com.example.Controller;
import com.example.pojo.Novel;
import com.example.service.NovelService;
import com.example.service.impl.NovelServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.pojo.Result;

import java.util.List;


@RestController
public class NovelController {
    @Autowired
    private NovelService novelService;
    private static Logger log= LoggerFactory.getLogger(NovelController.class);
    @GetMapping("/depts")
    public Result list(String qdClass,String qdName){
        log.info("查询全部小说");
        List<Novel> novelList = novelService.list(qdClass,qdName);
        return Result.success(novelList);
    }
//    @GetMapping("/depts")
//    public Result list(String qdClass,String qdName){
//        log.info("根据分类查询书籍：qdClass:{}",qdClass);
//        List<Novel> novelList = novelService.getByQdClass(qdClass);
//        return Result.success(novelList);
//    }
}
