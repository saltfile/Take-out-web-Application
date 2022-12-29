package com.saltfish.example.util;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Map;

public class json_Util {

    public static<T> String maptoJson(Map<String,T> map){
        Gson gson = new Gson();
        String gsonString = gson.toJson(map);
        System.out.println(gsonString);
        return gsonString;
    }

}
