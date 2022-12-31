package com.saltfish.example.service;

import com.google.gson.Gson;
import com.saltfish.example.dao.opertorDao;
import com.saltfish.example.dao.ordfromDao;
import com.saltfish.example.pojo.Admin;
import com.saltfish.example.pojo.Opertor;
import com.saltfish.example.pojo.OrdForm;
import com.saltfish.example.util.json_Util;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@Service
public class OpertorService {
    @Resource
    opertorDao opertorDao;

    @Resource
    ordfromDao ordfromDao;

    public String SelectAll(){
        Gson gson = new Gson();
       return gson.toJson(opertorDao.findall());
    }

    /**
     * 浏览全部订单
     * @return
     */
    public List<OrdForm> BrowseOrdersAll(){
        return ordfromDao.findAll();
    }


    public List<OrdForm> BrowseOrdersByCar_Tel(String car_tel){
        return ordfromDao.findByCarTel(car_tel);
    }

    public OrdForm BrowseOrdersByNum(String num){
        return ordfromDao.findByNumber(Integer.parseInt(num));
    }



    public String Login(String accout,String password){
        System.out.println(accout+" "+password);
        Opertor a = opertorDao.find(accout,password);

        if (a!=null&&a.weight){

            HashMap<String,Object> mes = new HashMap<>();
            mes.put("aid",a.oid);
            mes.put("status",true);
            mes.put("msg",accout+"登录成功");

            return json_Util.maptoJson(mes);
        }else if (a.weight == false){
            HashMap<String,Object> mes = new HashMap<>();
            mes.put("aid",-1);
            mes.put("status",false);
            mes.put("msg",accout+"您已被禁用");
            return json_Util.maptoJson(mes);
        }else {
            HashMap<String,Object> mes = new HashMap<>();
            mes.put("aid",-1);
            mes.put("status",false);
            mes.put("msg",accout+"登陆失败");
            return json_Util.maptoJson(mes);
        }




    }









}
