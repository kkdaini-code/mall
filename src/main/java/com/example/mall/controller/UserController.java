package com.example.mall.controller;


import com.baomidou.mybatisplus.extension.api.Assert;
import com.baomidou.mybatisplus.extension.enums.ApiErrorCode;
import com.example.mall.bean.Result;
import com.example.mall.bean.User;
import com.example.mall.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author kkdaini
 * @since 2020-07-28
 */
@RestController
public class UserController {
    @Autowired
    private IUserService userService;

    @PostMapping("/user")
    public boolean user(User user, String emailCode , HttpSession session){
        Assert.eq(emailCode,session.getAttribute("emailCode"), ApiErrorCode.FAILED);
        user.setAvatar("tou.jpg");
        userService.save(user);
        session.setAttribute("user",user);
        return true;
    }

    @GetMapping("/user")
    public Object getUser(HttpSession session){
        return session.getAttribute("user");
    }
}
