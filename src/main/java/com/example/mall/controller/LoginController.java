package com.example.mall.controller;

import com.example.mall.bean.User;
import com.example.mall.service.IUserService;
import com.example.mall.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @Autowired
    private IUserService userService;

    @PostMapping("/login")
    public String login(String name , String password, HttpSession session){
        User user=userService.getByName(name);
        if(user ==null){
        }
        if(!password.equals(user.getPassword())){
        }
        session.setAttribute("user",user);
        return "me";
    }
}
