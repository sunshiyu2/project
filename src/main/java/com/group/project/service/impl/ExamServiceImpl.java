package com.group.project.service.impl;

import com.group.project.Mapper.ExamMapper;
import com.group.project.pojo.Exam;
import com.group.project.service.ExamService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("examService")
public class ExamServiceImpl implements ExamService {

    @Resource
    private ExamMapper examMapper;

    @Override
    public List<Exam> getExamList() {
        return examMapper.selectList(null);
    }
}
