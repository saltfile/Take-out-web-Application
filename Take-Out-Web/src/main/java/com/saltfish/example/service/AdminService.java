package com.saltfish.example.service;

import com.saltfish.example.dao.adminDao;
import com.saltfish.example.dao.opertorDao;
import com.saltfish.example.dao.userDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AdminService {

    @Resource
    adminDao adminDao;
    @Resource
    opertorDao opertorDao;

    @Resource
    userDao userDao;

    /**
     * 创建新的管理员和操作员
     * @param accout 账号
     * @param password 密码
     * @return 是否成功
     */
    public boolean CreateAdmin(String accout,String password){
        return adminDao.insert(accout,password)>0;
    }


    /**
     * 创建新的操作员
     * @param accout 账号
     * @param password 密码
     * @return 是否成功
     */
    public boolean CreateOpertor(String accout,String password){
        return opertorDao.insert(accout,password)>0;
    }

    /**
     * 删除用户
     * @param tel 默认的用户账户只要输入电话号码自动注册不用用户操作
     * @return
     */
    public boolean DeleteUser(String tel){
        return userDao.delete(tel)>0;
    }

    /**
     * 重置用户密码
     * @param password 密码
     * @param tel 手机号
     * @return
     */
    public boolean ResetPasswordUser(String password,String tel){
        return userDao.update(password, tel)>0;
    }

    /**
     * 设置禁/启用户权限
     * @param weight
     * @param tel
     * @return
     */
    public boolean SetUserPermissions(int weight,String tel){
        return userDao.update_weight(weight,tel)>0;
    }



}
