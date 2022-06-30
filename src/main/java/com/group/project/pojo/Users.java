package com.group.project.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users {
    @TableId
    private Integer userid;
    private Integer roleid;
    private String username;
    private String userpwd;
    private String truename;
    private Integer classid;
}
