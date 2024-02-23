package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reader {
    private Integer id; //ID
    private String name; //用户名
    private String password; //密码
    private String information; //
    private String image; //图像url
}