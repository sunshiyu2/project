package com.group.project.service.impl;

import com.group.project.Mapper.PjclassMapper;
import com.group.project.pojo.Pjclass;
import com.group.project.service.PjclassService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("pjclassService")
public class PjclassServiceImpl implements PjclassService {

    @Resource
    private PjclassMapper pjclassMapper;

    @Override
    public List<Pjclass> getClassList() {
        return pjclassMapper.selectList(null);
    }

    @Override
    public int addClass(Pjclass pjclass) {
        return pjclassMapper.insert(pjclass);
    }

    @Override
    public int updateClass(Pjclass pjclass) {
        return pjclassMapper.updateById(pjclass);
    }

    @Override
    public int deleteClass(Pjclass pjclass) {
        return pjclassMapper.deleteById(pjclass);
    }
}
