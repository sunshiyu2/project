package com.group.project.service;

import com.group.project.pojo.Pjclass;

import java.util.List;

public interface PjclassService {
    public List<Pjclass> getClassList();

    public int addClass(Pjclass pjclass);

    public int updateClass(Pjclass pjclass);

    public int deleteClass(Pjclass pjclass);
}
