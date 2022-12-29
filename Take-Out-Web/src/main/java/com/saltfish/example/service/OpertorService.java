package com.saltfish.example.service;

import com.google.gson.Gson;
import com.saltfish.example.dao.opertorDao;
import com.saltfish.example.dao.ordfromDao;
import com.saltfish.example.pojo.OrdForm;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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











}
