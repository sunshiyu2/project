package com.group.project.service;

import com.group.project.pojo.Users;
import org.apache.catalina.User;

import javax.jws.soap.SOAPBinding;
import java.util.List;

public interface UsersService {
    public boolean isUserNameExists(String userName);

    public boolean registerUser(Users user);

    public Users loginUser(String userName, String password);

    public List<Users> getTeacherList();

    public int addTeacher(Users users);

    public int updateTeacher(Users users);

    public int deleteTeacher(Users users);

    public List<Users> getStudentList();

    public int addStudent(Users users);

    public int updateStudent(Users users);

    public int deleteStudent(Users users);

}
