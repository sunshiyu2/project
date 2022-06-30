package com.group.project.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Studentsubject {
    @TableId
    private Integer ssid;
    private Integer seid;
    private Integer userid;
    private Integer sid;
    private String studentkey;
}
