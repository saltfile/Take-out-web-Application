package com.saltfish.example.contoller;

import com.google.gson.Gson;
import com.saltfish.example.service.AdminService;
import com.saltfish.example.service.OdrfromService;
import com.saltfish.example.service.OpertorService;
import com.saltfish.example.util.json_Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;

@RestController
@RequestMapping(value = "/admin")
public class AdminContoller {

    @Autowired
    AdminService adminService;

    @Autowired
    OdrfromService odrfromService;

    @Autowired
    OpertorService opertorService;

    @PostMapping("/updateStatus")
    public String UpStatus(String userAccout,String status){
        boolean param;
        if (status.equals("false")){
            param = false;
        }else if (status.equals("true")){
            param = true;
        }else {
            HashMap<String,Object> mes = new HashMap<>();
            mes.put("status",false);
            mes.put("msg","修改失败");
            return json_Util.maptoJson(mes);
        }
        return adminService.SetOpertorPermissions(param,userAccout);
    }

    @PostMapping("/login")
    public String Login(String accout,String password){

      return adminService.LoginAdmin(accout,password);
    }

    @PostMapping("/selectAllOrder")
    public String OrdfromAll(){
        return odrfromService.SelectAll();
    }

    @PostMapping("/selectAllOpertor")
    public String OpertorAll(){
        return opertorService.SelectAll();
    }



    @PostMapping("/deleteUser")
    public String DelOpertor(String userAccout){
        return adminService.DeleteUser(userAccout);
    }

    @PostMapping("/addUser")
    public String AddOpertor(String accout,String password){
        System.out.println(accout+"  "+password);
        return adminService.CreateOpertor(accout, password);
    }
    @PostMapping("/addAdmin")
    public String AddAdmin(String accout,String password){
        System.out.println(accout+" "+password);
        return adminService.CreateAdmin(accout, password);
    }



}
