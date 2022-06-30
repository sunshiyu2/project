package com.group.project.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users {
    private Integer userid;
    private Integer roleid;
    private String username;
    private String userpwd;
    private String truename;
    private Integer classid;
}
