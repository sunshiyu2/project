package com.group.project.controller;

import com.google.gson.Gson;
import com.group.project.pojo.Exam;
import com.group.project.service.ExamService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin({"*","null"})
public class ExamController {

    @Resource
    private ExamService examService;

    private Gson gson = new Gson();

    @RequestMapping("/allExams")
    private String getExam(){
        List<Exam> list = examService.getExamList();
        return gson.toJson(list);
    }
}
