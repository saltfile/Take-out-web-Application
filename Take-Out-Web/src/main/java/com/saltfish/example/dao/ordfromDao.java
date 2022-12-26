package com.saltfish.example.dao;

import com.saltfish.example.pojo.Meal;
import com.saltfish.example.pojo.OrdForm;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ordfromDao {
    @Results({
            @Result(property = "order_num", column = "order_num"),
            @Result(property = "car_tel", column = "car_tel"),
            @Result(property = "del_tel", column = "del_tel"),
            @Result(property = "status", column = "status"),
            @Result(property = "mark", column = "mark"),
            @Result(property = "timestamp", column = "timestamp"),
            @Result(property = "meals", column = "meals"),
            @Result(property = "sum", column = "sum")
    })
    @Select("SELECT order_num,car_tel,del_tel,status,mark,timestamp,meals,sum FROM ordfrom")
    public List<OrdForm> findAll();

    @Select("SELECT * FROM ordfrom where order_num = #{num}")
    public OrdForm findByNumber(@Param("num")int num);

    @Results({
            @Result(property = "order_num", column = "order_num"),
            @Result(property = "car_tel", column = "car_tel"),
            @Result(property = "del_tel", column = "del_tel"),
            @Result(property = "status", column = "status"),
            @Result(property = "mark", column = "mark"),
            @Result(property = "timestamp", column = "timestamp"),
            @Result(property = "meals", column = "meals"),
            @Result(property = "sum", column = "sum")
    })
    @Select("SELECT order_num,car_tel,del_tel,status,mark,timestamp,meals,sum FROM ordfrom where car_tel = #{tel}")
    public List<OrdForm> findByCarTel(@Param("tel")String num);

    @Insert("insert into ordfrom(car_tel,del_tel,status,mark,timestamp,meals,sum)values (#{type},name,good,medim_poor,sum,intro,teste,img)")
    int insert(@Param("id")String id,@Param("password")String password);

    @Delete("DELETE FROM meal WHERE  name=#{id}")
    int Delete(@Param("id")String name);

    @Update("UPDATE meal SET intro = #{intro},img=#{img} WHERE name = #{name} ")
    int Update(@Param("intro")String intro, @Param("img")String img, @Param("name") String name);

}
