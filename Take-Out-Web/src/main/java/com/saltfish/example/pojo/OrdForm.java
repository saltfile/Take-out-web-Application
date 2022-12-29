package com.saltfish.example.pojo;

import lombok.Data;

import java.math.BigInteger;
import java.sql.Timestamp;

/**
 * 订单类
 */
@Data
public class OrdForm {
    /**
     * 订单号
     */
    public BigInteger order_num;
    /**
     * 订餐人电话
     */
    public String car_tel;
    /**
     * 外卖员电话
     */
    public String del_tel;
    /**
     * 状态位 接收中 0 配送中 1 已完成 2
     */
    public int status;
    /**
     * 备注
     */
    public String mark;
    /**
     *     用户账号
     */
    /**
     * 点的东西 json to list
     */
    public String meals;

    /**
     * 时间戳
     */
    public Timestamp timestamp;
    public double sum;

}
