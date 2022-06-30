package com.group.project.service;

import com.group.project.pojo.Course;

import java.util.List;

public interface CourseService {
    public List<Course> getCourseList();

    public int addCourse(Course course);

    public int updateCourse(Course course);

    public int deleteCourse(Course course);
}
