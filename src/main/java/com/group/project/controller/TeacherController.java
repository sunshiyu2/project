package com.group.project.controller;

import com.google.gson.Gson;
import com.group.project.pojo.Users;
import com.group.project.service.UsersService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("teacher")
@CrossOrigin(origins = {"*","null"})
public class TeacherController {
    @Resource
    private UsersService usersService;

    private Gson gson = new Gson();

    @RequestMapping("allStudents")
    public String getStudent(){
        Map<String,Object> map = new HashMap<>();
        List<Users> list = usersService.getStudentList();
        map.put("students",list);
        return gson.toJson(map);
    }

}
