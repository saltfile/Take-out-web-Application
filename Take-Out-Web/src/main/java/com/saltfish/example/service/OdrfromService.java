package com.saltfish.example.service;

import com.google.gson.Gson;
import com.saltfish.example.dao.ordfromDao;
import com.saltfish.example.pojo.Meals;
import com.saltfish.example.pojo.OrdForm;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OdrfromService {
    @Resource
    ordfromDao ordfromDao;


    /**
     * 只需在订餐页面填写电话号码即可订餐
     * @param car_tel 订餐人
     * @param del_tel 外卖的人
     * @param mark 备注
     * @param meals 前端菜的名字列表
     * @param sum 价钱总和
     * @return 是否成功
     */
    public boolean CreateOrdfrom(String car_tel,String del_tel,String mark,String meals,double sum){
        return ordfromDao.insert(car_tel,del_tel,0,mark,meals,sum)>0;
    }


    /**
     * 取消订单
     * @param order_num 订单号
     * @return -1 代表这个订单已经做了或者送去了无法取消 0 没找到这个订单 1 成功删除
     */
    public int CancelOrdform(int order_num){
        OrdForm ordForm = ordfromDao.findByNumber(order_num);
        if (ordForm.status > 1)return -1;
        if (ordfromDao.delete(order_num)>0)
        return 1;
        return 0;
    }


    public String SelectAll(){
        Gson gson = new Gson();
        return gson.toJson(ordfromDao.findAll());
    }
    


}
