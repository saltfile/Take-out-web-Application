package com.saltfish.example.dao;

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
       if (adminDao.insert("admin","123456")>0){
           System.out.println("创建成功");
       }




    }
}