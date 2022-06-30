package com.group.project.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Paper {
    private Integer pid;
    private Integer eid;
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
