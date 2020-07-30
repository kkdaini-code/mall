package com.example.mall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/jp")
public class JumpController {
    @GetMapping("/cart")
    public String cart(){return "cart";}
    @GetMapping("/details")
    public String details(){return "details";}
    @GetMapping("/fashion")
    public String fashion(){return "fashion";}
    @GetMapping("/featured")
    public String featured(){return "featured";}
    @GetMapping("/home")
    public String home(){return "home";}
    @GetMapping("/login")
    public String login(){return "login";}
    @GetMapping("/love")
    public String love(){return "love";}
    @GetMapping("/me")
    public String me(){return "me";}
}
