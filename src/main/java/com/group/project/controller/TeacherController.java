package com.group.project.controller;

import com.google.gson.Gson;
import com.group.project.pojo.Users;
import com.group.project.service.UsersService;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
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

    //得到所有学生
    @RequestMapping("allStudents")
    public String getStudent(){
        Map<String,Object> map = new HashMap<>();
        List<Users> list = usersService.getStudentList();
        map.put("students",list);
        return gson.toJson(map);
    }

    //添加学生
    @RequestMapping("/addStudent")
    public String addStudent(@RequestBody Users users){
        Map<String,Object> map = new HashMap<>();
        int num = usersService.addStudent(users);
        if (num>0){
            map.put("status","1");
        }
        else {
            map.put("msg","添加失败");
            map.put("status","0");
        }
        return gson.toJson(map);
    }

    //修改学生
    @RequestMapping("/updateStudent")
    public String updateStudent(@RequestBody Users users){
        Map<String,Object> map = new HashMap<>();
        int num = usersService.updateStudent(users);
        if (num>0){
            map.put("status","1");
        }
        else {
            map.put("msg","修改失败");
            map.put("status","0");
        }
        return gson.toJson(map);
    }

    //删除学生
    @RequestMapping("/deleteStudent")
    public String deleteStudent(@RequestBody Users users){
        Map<String,Object> map = new HashMap<>();
        int num = usersService.deleteStudent(users);
        if (num>0){
            map.put("status","1");
        }
        else {
            map.put("msg","删除失败");
            map.put("status","0");
        }
        return gson.toJson(map);
    }





}
