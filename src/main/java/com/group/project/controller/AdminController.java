package com.group.project.controller;

import com.google.gson.Gson;
import com.group.project.pojo.Course;
import com.group.project.pojo.Pjclass;
import com.group.project.pojo.Users;
import com.group.project.service.CourseService;
import com.group.project.service.PjclassService;
import com.group.project.service.UsersService;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = {"*","null"})
@RequestMapping("/admin")
public class AdminController {
    @Resource
    private CourseService courseService;

    @Resource
    private UsersService usersService;

    @Resource
    private PjclassService pjclassService;

    private Gson gson = new Gson();

    //得到所有课程
    @RequestMapping("/allCourses")
    public String getAllCourses(){
        Map<String,Object> map = new HashMap<>();
        List<Course> list = courseService.getCourseList();
        map.put("courses",list);
        return gson.toJson(map);
    }

    //得到所有教师
    @RequestMapping("/allTeachers")
    public String getAllTeachers(){
        Map<String,Object> map = new HashMap<>();
        List<Users> list = usersService.getTeacherList();
        map.put("teachers",list);
        return gson.toJson(map);
    }

    //得到所有班级
    @RequestMapping("/allClasses")
    public String getAllClasses(){
        Map<String,Object> map = new HashMap<>();
        List<Pjclass> list = pjclassService.getClassList();
        map.put("classes",list);
        return gson.toJson(map);
    }

    //添加教师
    @RequestMapping("/addTeacher")
    public String addTeacher(@RequestBody Users users){
        Map<String,Object> map = new HashMap<>();
        int num = usersService.addTeacher(users);
        if (num>0){
            map.put("status","1");
        }
        else {
            map.put("msg","添加失败");
            map.put("status","0");
        }
        return gson.toJson(map);
    }




}
