package com.saltfish.example.dao;

import com.saltfish.example.pojo.Admin;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class adminDaoTest {
    @Resource
    adminDao adminDao;

    @Test
    void insert() {
       Admin a = adminDao.find("admin","123456");
        System.out.println(a.accout);
       }




    }