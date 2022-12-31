package com.saltfish.example.contoller;

import com.saltfish.example.service.MealService;
import com.saltfish.example.service.OdrfromService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class MealContoller {
    @Autowired
    MealService mealService;
    @Autowired
    OdrfromService odrfromService;
    @PostMapping("/getAllMeal")
    public String AllMeal(){
        return mealService.MealAll();
    }


    @PostMapping("/addOrd")
    public String addOrd(String car_tel,String mark,String meals,String sum){
        System.out.println(car_tel+" "+mark+meals+sum);


        double a = Double.parseDouble(sum);
        return odrfromService.CreateOrdfrom(car_tel,mark,meals,a);
    }




}
