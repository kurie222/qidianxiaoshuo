package com.example.Controller;

import com.example.pojo.Reader;
import com.example.pojo.Result;
import com.example.service.ReaderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/emps")
public class ReaderController {
    @Autowired
    private ReaderService readerService;
    @PostMapping
    public Result save(@RequestBody Reader reader){
        log.info("新增员工, emp: {}", reader);
        readerService.save(reader);
        return Result.success();
    }
    @PutMapping
    public Result update(@RequestBody Reader reader){
        log.info("更新员工信息 : {}", reader);
        readerService.update(reader);
        return Result.success();
    }
}
