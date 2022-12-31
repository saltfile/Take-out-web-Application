package com.saltfish.example.contoller;

import com.saltfish.example.service.MealService;
import com.saltfish.example.service.OdrfromService;
import com.saltfish.example.service.OpertorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value = "/opertor")
public class OpertorContoller {
    @Autowired
    MealService mealService;
    @Autowired
    OpertorService opertorService;
    @Autowired
    OdrfromService odrfromService;

    @PostMapping("/addMeal")
    public String add_Meal(String type,String name,String sum,String intro, String teste,String img){
        double m_sum = Double.parseDouble(sum);
        return mealService.Createmeal(type,name,m_sum,intro,teste,img);
    }


    @PostMapping("/login")
    public String Login(String accout,String password){

        return opertorService.Login(accout, password);
    }


    @PostMapping("/updateOrder")
    public String updateOrd(String oid,String status){
        int oids = Integer.parseInt(oid);
        int statuss = Integer.parseInt(status);
        return odrfromService.UpdateStatus(oids,statuss);
    }

    @PostMapping("/updateDelTel")
    public String updateHandler(String oid,String tel){
        int oids = Integer.parseInt(oid);
        return odrfromService.UpdateOrd(oids,tel,1);
    }

}
