package com.example.mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Random;

@RestController
@RequestMapping("/tools")
public class ToolsController {
    @Autowired
    JavaMailSenderImpl mailSender;
    @GetMapping("/emailCode/{email}")
    public String eamilCode(@PathVariable("email") String email, HttpSession session){
        Random random = new Random();
        String emailServiceCode="";
        for (int i=0;i<6;i++)
        {
            emailServiceCode += random.nextInt(10);
        }

        session.setAttribute("emailCode",emailServiceCode);

        SimpleMailMessage message=new SimpleMailMessage();
        message.setSubject("注册验证码");
        message.setText("注册验证码是："+emailServiceCode);
        message.setFrom("kkdaini@163.com");
        message.setTo(email);
        mailSender.send(message);
        return "成功";
    }
}
