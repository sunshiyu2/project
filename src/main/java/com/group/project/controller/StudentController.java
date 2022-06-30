package com.group.project.controller;

import com.google.gson.Gson;
import com.group.project.service.StudentService;
import com.group.project.pojo.Student;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin(origins = {"*","null"})
public class StudentController {
    //@Resource
    private StudentService studentService;
    private Gson gson = new Gson();

    @GetMapping("/students")
    public String getStudents(){
        List<Student> students = studentService.getStudentList();
        return gson.toJson(students);
    }

    @PostMapping("/add")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }

    @PostMapping("/delete")
    public void deleteStudent(@RequestBody Student student){
        studentService.deleteStudent(student);
    }

    @PostMapping("/update")
    public void updateStudent(@RequestBody Student student){
        studentService.updateStudent(student);
    }
}
