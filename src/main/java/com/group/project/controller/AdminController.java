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

    //得到所有教师
    @RequestMapping("/allTeachers")
    public String getAllTeachers(){
        Map<String,Object> map = new HashMap<>();
        List<Users> list = usersService.getTeacherList();
        map.put("teachers",list);
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

    //修改教师
    @RequestMapping("/updateTeacher")
    public String updateTeacher(@RequestBody Users users){
        Map<String,Object> map = new HashMap<>();
        int num = usersService.updateTeacher(users);
        if (num>0){
            map.put("status","1");
        }
        else {
            map.put("msg","修改失败");
            map.put("status","0");
        }
        return gson.toJson(map);
    }

    //删除教师
    @RequestMapping("/deleteTeacher")
    public String deleteTeacher(@RequestBody Users users){
        Map<String,Object> map = new HashMap<>();
        int num = usersService.deleteTeacher(users);
        if (num>0){
            map.put("status","1");
        }
        else {
            map.put("msg","删除失败");
            map.put("status","0");
        }
        return gson.toJson(map);
    }

    //得到所有课程
    @RequestMapping("/allCourses")
    public String getAllCourses(){
        Map<String,Object> map = new HashMap<>();
        List<Course> list = courseService.getCourseList();
        map.put("courses",list);
        return gson.toJson(map);
    }

    //添加课程
    @RequestMapping("addCourse")
    public String addCourse(@RequestBody Course course){
        Map<String,Object> map = new HashMap<>();
        int num = courseService.addCourse(course);
        if (num>0){
            map.put("status","1");
        }
        else {
            map.put("msg","添加失败");
            map.put("status","0");
        }
        return gson.toJson(map);
    }

    //修改课程
    @RequestMapping("/updateCourse")
    public String updateCourse(@RequestBody Course course){
        Map<String,Object> map = new HashMap<>();
        int num = courseService.updateCourse(course);
        if (num>0){
            map.put("status","1");
        }
        else {
            map.put("msg","修改失败");
            map.put("status","0");
        }
        return gson.toJson(map);
    }

    //删除课程
    @RequestMapping("deleteCourse")
    public String deleteCourse(@RequestBody Course course){
        Map<String,Object> map = new HashMap<>();
        int num = courseService.deleteCourse(course);
        if (num>0){
            map.put("status","1");
        }
        else {
            map.put("msg","删除失败");
            map.put("status","0");
        }
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

    //添加班级
    @RequestMapping("/addClass")
    public String addClass(@RequestBody Pjclass pjclass){
        Map<String,Object> map = new HashMap<>();
        int num = pjclassService.addClass(pjclass);
        if (num>0){
            map.put("status","1");
        }
        else {
            map.put("msg","添加失败");
            map.put("status","0");
        }
        return gson.toJson(map);
    }

    //修改班级
    @RequestMapping("/updateClass")
    public String updateClass(@RequestBody Pjclass pjclass){
        Map<String,Object> map = new HashMap<>();
        int num = pjclassService.updateClass(pjclass);
        if (num>0){
            map.put("status","1");
        }
        else {
            map.put("msg","修改失败");
            map.put("status","0");
        }
        return gson.toJson(map);
    }

    //删除班级
    @RequestMapping("/deleteClass")
    public String deleteClass(@RequestBody Pjclass pjclass){
        Map<String,Object> map = new HashMap<>();
        int num = pjclassService.deleteClass(pjclass);
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
