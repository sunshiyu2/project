package com.group.project.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @TableId
    private Integer id;
    private String number;
    private String name;
    private Integer age;
    private Integer chinese;
    private Integer math;
    private Integer english;
}
