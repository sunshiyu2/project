package com.group.project.service.impl;

import com.group.project.Mapper.SubjectMapper;
import com.group.project.pojo.Subject;
import com.group.project.service.SubjectService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("subjectService")
public class SubjectServiceImpl implements SubjectService {

    @Resource
    private SubjectMapper subjectMapper;

    @Override
    public List<Subject> getSubjectList() {
        return subjectMapper.selectList(null);
    }

    @Override
    public int addSubject(Subject subject) {
        return subjectMapper.insert(subject);
    }

    @Override
    public int updateSubject(Subject subject) {
        return subjectMapper.updateById(subject);
    }

    @Override
    public int deleteSubject(Subject subject) {
        return subjectMapper.deleteById(subject);
    }
}
