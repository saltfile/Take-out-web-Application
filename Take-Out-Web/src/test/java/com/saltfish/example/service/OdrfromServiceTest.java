package com.saltfish.example.service;

import com.google.gson.Gson;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class OdrfromServiceTest {
    @Autowired
    OdrfromService odrfromService;
    @Test
    void createOrdfrom() {
//        odrfromService.CreateOrdfrom("13212512315","13545554125","mark","{aaa:1,bbb:2}",80.02);
    }

    @Test
    void selectAll() {
        Gson gson = new Gson();
        System.out.println(gson.toJson(odrfromService.SelectAll()));
    }
}