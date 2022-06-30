package com.group.project.service.impl;

import com.group.project.service.StudentService;
import com.group.project.Mapper.StudentMapper;
import com.group.project.pojo.Student;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

//@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper studentMapper;

    @Override
    public List<Student> getStudentList() {
        return studentMapper.selectList(null);
    }

    @Override
    public void addStudent(Student student) {
        studentMapper.insert(student);
    }

    @Override
    public void deleteStudent(Student student) {
        studentMapper.deleteById(student);
    }

    @Override
    public void updateStudent(Student student) {
        studentMapper.updateById(student);
    }
}
