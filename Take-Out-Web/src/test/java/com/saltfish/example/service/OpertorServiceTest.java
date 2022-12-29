package com.saltfish.example.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class OpertorServiceTest {
@Autowired
OpertorService opertorService;
    @Autowired
    AdminService adminService;
    @Test
    void selectAll() {
        System.out.println(opertorService.SelectAll());
    }
    @Test
    void add(){
        System.out.println(adminService.CreateOpertor("aaaa","123456"));
    }
}