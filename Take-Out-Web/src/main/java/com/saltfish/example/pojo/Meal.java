package com.saltfish.example.pojo;

import lombok.Data;

/**
 * 菜单类
 */
@Data
public class Meal {

    public int num;
    /**
     *  类型
     */
    public String type;
    /**
     * 名字
     */
    public String name;
    /**
     * 金额
     */
    public double sum;
    /**
     * 好/中差评
     */
    public int good;
    public int medim_poor;
    /**
     * 简介
     */

    public String intro;
    /**
     *  口味
     */
    public String taste;
    /**
     * 图片
     */
    public String img;
}
