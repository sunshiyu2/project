package com.group.project.service;

import com.group.project.pojo.Student;

import java.util.List;

public interface StudentService {
    public List<Student> getStudentList();
    public void addStudent(Student student);
    public void deleteStudent(Student student);
    public void updateStudent(Student student);
}
