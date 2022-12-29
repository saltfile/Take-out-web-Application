package com.saltfish.example.service;

import com.saltfish.example.dao.adminDao;
import com.saltfish.example.dao.opertorDao;
import com.saltfish.example.dao.userDao;
import com.saltfish.example.pojo.Admin;
import com.saltfish.example.util.json_Util;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;

@Service
public class AdminService {

    @Resource
    adminDao adminDao;
    @Resource
    opertorDao opertorDao;

    @Resource
    userDao userDao;


    public String LoginAdmin(String accout,String password){
        System.out.println(accout+" "+password);
        Admin a = adminDao.find(accout,password);

        if (a!=null){

            HashMap<String,Object> mes = new HashMap<>();
            mes.put("aid",a.aid);
            mes.put("status",true);
            mes.put("msg",accout+"登录成功");

            return json_Util.maptoJson(mes);
        }else {
            HashMap<String,Object> mes = new HashMap<>();
            mes.put("aid",-1);
            mes.put("status",false);
            mes.put("msg",accout+"登陆失败");
            return json_Util.maptoJson(mes);
        }



    }

    /**
     * 创建新的管理员和操作员
     * @param accout 账号
     * @param password 密码
     * @return 是否成功
     */
    public String CreateAdmin(String accout,String password){
        if (adminDao.find(accout, password)!=null){
            HashMap<String,Object> mes = new HashMap<>();
            mes.put("status",false);
            mes.put("msg","添加失败");
            return json_Util.maptoJson(mes);
        }

        if (adminDao.insert(accout,password)>0){
            HashMap<String,Object> mes = new HashMap<>();
            mes.put("status",true);
            mes.put("msg","添加成功");
            return json_Util.maptoJson(mes);
        }else {
            HashMap<String,Object> mes = new HashMap<>();
            mes.put("status",false);
            mes.put("msg","添加失败");
            return json_Util.maptoJson(mes);
        }
    }


    /**
     * 创建新的操作员
     * @param accout 账号
     * @param password 密码
     * @return 是否成功
     */
    public String CreateOpertor(String accout,String password){
        if (opertorDao.find(accout, password)!=null){
            HashMap<String,Object> mes = new HashMap<>();
            mes.put("status",false);
            mes.put("msg","添加失败");
            return json_Util.maptoJson(mes);
        }

        if (opertorDao.insert(accout,password)>0){
            HashMap<String,Object> mes = new HashMap<>();
            mes.put("status",true);
            mes.put("msg","添加成功");
            return json_Util.maptoJson(mes);
        }else {
            HashMap<String,Object> mes = new HashMap<>();
            mes.put("status",false);
            mes.put("msg","添加失败");
            return json_Util.maptoJson(mes);
        }
    }

    /**
     * 删除用户
     * @param tel 默认的用户账户只要输入电话号码自动注册不用用户操作
     * @return
     */
    public String DeleteUser(String tel){
        if (opertorDao.delete(tel)>0){
            HashMap<String,Object> mes = new HashMap<>();
            mes.put("status",true);
            mes.put("msg","删除成功");
            return json_Util.maptoJson(mes);
        }else{
            HashMap<String,Object> mes = new HashMap<>();
            mes.put("status",false);
            mes.put("msg","删除失败");
            return json_Util.maptoJson(mes);
        }
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
     */
    public String SetOpertorPermissions(boolean status,String tel){
        if (opertorDao.updateQUAN(status, tel)>0){
            HashMap<String,Object> mes = new HashMap<>();
            mes.put("status",true);
            mes.put("msg","修改成功");
            return json_Util.maptoJson(mes);
        }else{
            HashMap<String,Object> mes = new HashMap<>();
            mes.put("status",false);
            mes.put("msg","修改失败");
            return json_Util.maptoJson(mes);
        }
    }



}
