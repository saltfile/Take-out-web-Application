package com.saltfish.example.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class AdminServiceTest {
    @Autowired
    AdminService adminService;
    @Test
    void loginAdmin() {
        System.out.println(adminService.SetOpertorPermissions(true,"aaaa"));
//        adminService.LoginAdmin("admin","123456");
    }
}