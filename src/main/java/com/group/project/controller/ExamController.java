package com.group.project.controller;

import com.google.gson.Gson;
import com.group.project.pojo.Exam;
import com.group.project.pojo.Subject;
import com.group.project.service.ExamService;
import com.group.project.service.SubjectService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin({"*","null"})
@RequestMapping("/exam")
public class ExamController {

    @Resource
    private ExamService examService;

    @Resource
    private SubjectService subjectService;

    private Gson gson = new Gson();

    //得到所有考试
    @RequestMapping("/all")
    public String getExam(){
        List<Exam> list = examService.getExamList();
        return gson.toJson(list);
    }

    //增加考试
    @RequestMapping("/add")
    public  String addExam(@RequestBody Exam exam){
        Map<String,Object> map = new HashMap<>();
        int num = examService.addExam(exam);
        if (num>0){
            map.put("status","1");
        }
        else {
            map.put("msg","添加失败");
            map.put("status","0");
        }
        return gson.toJson(map);
    }

    //修改考试
    @RequestMapping("/update")
    public String updateExam(@RequestBody Exam exam){
        Map<String,Object> map = new HashMap<>();
        int num = examService.updateExam(exam);
        if (num>0){
            map.put("status","1");
        }
        else {
            map.put("msg","修改失败");
            map.put("status","0");
        }
        return gson.toJson(map);
    }

    //删除考试
    @RequestMapping("/delete")
    public String deleteExam(@RequestBody Exam exam){
        Map<String,Object> map = new HashMap<>();
        int num = examService.deleteExam(exam);
        if (num>0){
            map.put("status","1");
        }
        else {
            map.put("msg","删除失败");
            map.put("status","0");
        }
        return gson.toJson(map);
    }

    //得到所有题目
    @RequestMapping("/allSubjects")
    public String getSingles(){
        List<Subject> list = subjectService.getSubjectList();
        return gson.toJson(list);
    }

    //添加题目
    @RequestMapping("/addSubject")
    public String addSubject(@RequestBody Subject subject){
        Map<String,Object> map = new HashMap<>();
        int num = subjectService.addSubject(subject);
        if (num>0){
            map.put("status","1");
        }
        else {
            map.put("msg","添加失败");
            map.put("status","0");
        }
        return gson.toJson(map);
    }

    //修改题目
    @RequestMapping("/updateSubject")
    public String updateSubject(@RequestBody Subject subject){
        Map<String,Object> map = new HashMap<>();
        int num = subjectService.updateSubject(subject);
        if (num>0){
            map.put("status","1");
        }
        else {
            map.put("msg","修改失败");
            map.put("status","0");
        }
        return gson.toJson(map);
    }

    //删除题目
    @RequestMapping("deleteSubject")
    public String deleteSubject(@RequestBody Subject subject){
        Map<String,Object> map = new HashMap<>();
        int num = subjectService.deleteSubject(subject);
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
