package com.group.project.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Exam {
    private Integer eid;
    private String pname;
    private Integer cno;
    private Integer userid;
    private Integer classid;
    private Integer singlenumber;
    private Integer singlecore;
    private Integer multiplenumber;
    private Integer multiplecore;
    private Date examdate;
    private Date examtime;
    private Integer testtime;
}
