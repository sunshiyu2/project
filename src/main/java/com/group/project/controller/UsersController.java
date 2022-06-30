package com.group.project.controller;


import com.google.gson.Gson;
import com.group.project.pojo.Users;
import com.group.project.service.UsersService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = {"*","null"})
public class UsersController {
    @Resource
    private UsersService userService;
    private Gson gson = new Gson();

    @RequestMapping("/register")
    public String register(@RequestBody Users user) {
        String userName = user.getUsername();
        String password = user.getUserpwd();
        Map<String,Object> map = new HashMap<>();

        //判断用户名或密码是否为空
        if (userName == null || "".equals(userName)) {
            map.put("msg","账号为空，请重新输入");
            map.put("status","0");
            return gson.toJson(map);
        }
        if (password == null || "".equals(password)) {
            map.put("msg","密码为空，请重新输入");
            map.put("status","0");
            return gson.toJson(map);

        }

        //判断账号是否存在
        if (userService.isUserNameExists(userName)) {
            map.put("msg","注册失败，账号已存在");
            map.put("status","0");
            return gson.toJson(map);
        }

        //进行注册
        if (userService.registerUser(user)) {
            map.put("msg","注册成功，请登录");
            map.put("status","1");
            return gson.toJson(map);
        } else {
            map.put("msg","注册失败，请重新注册");
            map.put("status","0");
            return gson.toJson(map);
        }
    }

    @PostMapping("/login")
    public String login(@RequestBody Users user){
        String userName = user.getUsername();
        String password = user.getUserpwd();
        Map<String,Object> map = new HashMap<>();
        //判断用户名或密码是否为空
        if(userName==null || "".equals(userName))
        {
            map.put("msg","账号为空，请重新输入");
            map.put("status","0");
            return gson.toJson(map);
        }
        if(password==null || "".equals(password)){
            map.put("msg","密码为空，请重新输入");
            map.put("status","0");
            return gson.toJson(map);
        }
        //登录
        user = userService.loginUser(userName,password);
        if(user!=null){
            map.put("status","1");
            return gson.toJson(map);
        }
        else{
            map.put("msg","登录失败，请重新登录");
            map.put("status","0");
            return gson.toJson(map);
        }
    }

    @RequestMapping("/logout")
    public void logout(HttpServletRequest httpServletRequest){
        HttpSession session = httpServletRequest.getSession();
        session.invalidate();
    }
}
