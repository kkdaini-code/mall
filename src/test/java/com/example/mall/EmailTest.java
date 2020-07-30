package com.example.mall;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@SpringBootTest
public class EmailTest{
@Autowired
JavaMailSenderImpl mailSender;

        private String emailServiceCode;

@Test
public void test(){
        emailServiceCode="1234";
        SimpleMailMessage message=new SimpleMailMessage();
        message.setSubject("注册验证码");
        message.setText("注册验证码是："+emailServiceCode);
        message.setFrom("kkdaini@163.com");
        message.setTo("3153838068@qq.com");
        mailSender.send(message);
        }
}