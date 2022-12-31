package com.saltfish.example.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageContoller {
    @RequestMapping("/meun")
    public String STest(){
        return "/index.html";
    }
    @RequestMapping("/login")
    public String login_admin(){return "/login.html";}
    @RequestMapping("/user")
    public String user_main(){return "/user_main.html";}
}
