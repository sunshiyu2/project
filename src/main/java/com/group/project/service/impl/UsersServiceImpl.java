package com.group.project.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.group.project.pojo.Users;
import com.group.project.service.UsersService;
import com.group.project.Mapper.UsersMapper;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("usersService")
public class UsersServiceImpl implements UsersService {

    @Resource
    private UsersMapper usersMapper;



    @Override
    public boolean isUserNameExists(String userName) {
        Users user = new Users();
        user.setUsername(userName);
        QueryWrapper<Users> queryWrapper = new QueryWrapper<>(user);
        user=usersMapper.selectOne(queryWrapper);
        if (user!=null)
            return true;
        else
            return false;
    }

    @Override
    public boolean registerUser(Users user) {
        int num = usersMapper.insert(user);
        if (num>0)
            return true;
        else
            return false;
    }

    @Override
    public Users loginUser(String userName, String password) {
        Users user = new Users();
        user.setUsername(userName);
        user.setUserpwd(password);
        QueryWrapper<Users> queryWrapper = new QueryWrapper<>(user);
        user=usersMapper.selectOne(queryWrapper);
        return user;
    }

    @Override
    public List<Users> getTeacherList() {
        Users users = new Users();
        users.setRoleid(1);
        QueryWrapper<Users> queryWrapper = new QueryWrapper<>();
        queryWrapper.setEntity(users);
        return usersMapper.selectList(queryWrapper);
    }

    @Override
    public List<Users> getStudentList() {
        Users users = new Users();
        users.setRoleid(2);
        QueryWrapper<Users> queryWrapper = new QueryWrapper<>();
        queryWrapper.setEntity(users);
        return usersMapper.selectList(queryWrapper);
    }

    @Override
    public int addTeacher(Users users) {
        return usersMapper.insert(users);
    }

    @Override
    public int updateTeacher(Users users) {
        return usersMapper.updateById(users);
    }

    @Override
    public int deleteTeacher(Users users) {
        return usersMapper.deleteById(users);
    }


}
