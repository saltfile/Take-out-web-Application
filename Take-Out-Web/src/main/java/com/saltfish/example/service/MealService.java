package com.saltfish.example.service;

import com.saltfish.example.dao.mealDao;
import com.saltfish.example.pojo.Meal;
import com.saltfish.example.util.json_Util;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class MealService {
    @Resource
    mealDao mealDao;

    public String Createmeal(String type,String name,double sum,String intro, String teste,String img){

        if (mealDao.find(name)!=null){
            HashMap<String,Object> mes = new HashMap<>();
            mes.put("status",false);
            mes.put("msg","添加失败");
            return json_Util.maptoJson(mes);
        }

        if (mealDao.insert(type,name,0,0,sum,intro,teste,img)>0){
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



    public String MealAll(){
        List<Meal> ms = mealDao.findAll();
        HashMap<String,List<Meal>> mes = new HashMap<>();
        for (Meal o:ms){
            if (mes.get(o.type)!= null){
                mes.get(o.type).add(o);
            }else {
                List<Meal> ml = new ArrayList<>();
                ml.add(o);
                mes.put("x"+o.num,ml);
            }
        }

        return  json_Util.maptoJson(mes);
    }



}
