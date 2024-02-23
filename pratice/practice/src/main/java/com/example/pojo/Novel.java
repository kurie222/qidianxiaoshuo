package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Novel {
    private Integer id; //ID
    private String qdName; //小说名称
     private String qdWriter; //小
    private String qdInformation;
    private String qdClass;
}
