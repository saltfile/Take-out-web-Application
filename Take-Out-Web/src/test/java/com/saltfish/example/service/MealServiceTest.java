package com.saltfish.example.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class MealServiceTest {
    @Resource
    MealService mealService;
    @Test
    void createmeal() {

        mealService.Createmeal("盖饭","鱼香肉丝盖饭",12.5,"可好吃了","甜辣","F:\\githubPro\\Take-out-web-Application\\Take-Out-Web\\src\\main\\resources\\static\\image\\img.jpg");






    }
}