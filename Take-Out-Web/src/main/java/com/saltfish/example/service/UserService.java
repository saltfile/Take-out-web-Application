package com.saltfish.example.service;

import com.saltfish.example.dao.userDao;
import com.saltfish.example.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    userDao userDao;

    /**
     * 直接登录没有用户的话就注册一下
     * @param tel
     * @return
     */
    public User login(String tel){
        User user = userDao.find(tel);

        if (user!=null)return user;

        user = new User();
        user.tel = tel;
        user.password = "";

        if (userDao.insert(tel,"")>0)return user;

        return null;
    }








}
