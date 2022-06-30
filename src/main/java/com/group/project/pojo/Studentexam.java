package com.group.project.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Studentexam {
    @TableId
    private Integer seid;
    private Integer userid;
    private Integer classid;
    private Integer eid;
    private String pname;
    private Integer zscore;
    private Integer score;
    private Data tjtime;
}
