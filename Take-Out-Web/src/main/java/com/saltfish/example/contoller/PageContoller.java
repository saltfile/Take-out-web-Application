package com.saltfish.example.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageContoller {
    @RequestMapping("/meun")
    public String STest(){
        return "/choose_meal.html";
    }
}
