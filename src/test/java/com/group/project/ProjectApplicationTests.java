package com.group.project;

import com.group.project.Mapper.UsersMapper;
import com.group.project.service.UsersService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest

class ProjectApplicationTests {

    @Resource
    private UsersMapper usersMapper;

    @Resource
    private UsersService usersService;

    @Test
    void contextLoads() {
        System.out.println(usersService.loginUser("1001","1"));
    }

}
