package com.saltfish.example.util;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class json_UtilTest {

    @Test
    void maptoJson() {
        HashMap<String,Object> mal = new HashMap<>();
        mal.put("aid",111);
        mal.put("status",false);
        mal.put("msg","asdasdasdasda");
        json_Util.maptoJson(mal);

    }
}