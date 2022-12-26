package com.saltfish.example.pojo;

import lombok.Data;

/**
 * 这是用户游客
 */
@Data
public class User {
    /**
     *  用户名
     */
//    public String name;
    /**
     * 电话
     */
    public String tel;
    /**
     * 密码
     */
    public String password;
    /**
     * 权限
     */
    public int weight;



}
