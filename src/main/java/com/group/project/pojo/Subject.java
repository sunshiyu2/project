package com.group.project.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Subject {
    @TableId
    private Integer sid;
    private Integer cno;
    private Integer stype;
    private String scontent;
    private String sa;
    private String sb;
    private String sc;
    private String sd;
    private String skey;
}
