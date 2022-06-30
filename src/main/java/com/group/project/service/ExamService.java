package com.group.project.service;

import com.group.project.pojo.Exam;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ExamService {
    public List<Exam> getExamList();
}
