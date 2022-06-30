package com.group.project.service;

import com.group.project.pojo.Subject;
import org.springframework.stereotype.Service;

import java.util.List;

public interface SubjectService {

    public List<Subject> getSubjectList();

    public int addSubject(Subject subject);

    public int updateSubject(Subject subject);

    public int deleteSubject(Subject subject);
}
