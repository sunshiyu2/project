package com.group.project.service.impl;

import com.group.project.Mapper.CourseMapper;
import com.group.project.pojo.Course;
import com.group.project.service.CourseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("courseService")
public class CourseServiceImpl implements CourseService {

    @Resource
    private CourseMapper courseMapper;

    @Override
    public List<Course> getCourseList() {
        return courseMapper.selectList(null);
    }

    @Override
    public int addCourse(Course course) {
        return courseMapper.insert(course);
    }

    @Override
    public int updateCourse(Course course) {
        return courseMapper.updateById(course);
    }

    @Override
    public int deleteCourse(Course course) {
        return courseMapper.deleteById(course);
    }
}
