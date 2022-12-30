package com.saltfish.example.dao;

import com.saltfish.example.pojo.Meal;
import com.saltfish.example.pojo.Opertor;
import org.apache.ibatis.annotations.*;

import java.sql.Time;
import java.util.List;

@Mapper
public interface mealDao {
    @Results({
            @Result(property = "num", column = "num"),
            @Result(property = "type", column = "type"),
            @Result(property = "name", column = "name"),
            @Result(property = "good", column = "good"),
            @Result(property = "medim_poor", column = "medim_poor"),
            @Result(property = "sum", column = "sum"),
            @Result(property = "intro", column = "intro"),
            @Result(property = "taste", column = "taste"),
            @Result(property = "img", column = "img")
    })
    @Select("SELECT num,type,name,good,medim_poor,sum,intro,taste,img FROM meal")
    public List<Meal> findAll();

    @Results({
            @Result(property = "num", column = "num"),
            @Result(property = "type", column = "type"),
            @Result(property = "name", column = "name"),
            @Result(property = "good", column = "good"),
            @Result(property = "medim_poor", column = "medim_poor"),
            @Result(property = "sum", column = "sum"),
            @Result(property = "intro", column = "intro"),
            @Result(property = "taste", column = "taste"),
            @Result(property = "img", column = "img")
    })
    @Select("SELECT num,type,name,good,medim_poor,sum,intro,taste,img FROM meal where type = #{type}")
    public List<Meal> findByType(@Param("type")String type);

    @Select("SELECT * FROM meal WHERE name=#{name}")
    Meal find(@Param("name")String name);

    @Insert("insert into meal(type,name,good,medim_poor,sum,intro,taste,img)values (#{type},#{name},#{good},#{medim_poor},#{sum},#{intro},#{teste},#{img})")
    int insert(@Param("type")String type,@Param("name")String name,
               @Param("good")int good,@Param("medim_poor")int medim_poor,
               @Param("sum")double sum,@Param("intro")String intro,
               @Param("teste")String teste,@Param("img")String img);

    @Delete("DELETE FROM meal WHERE  name=#{id}")
    int Delete(@Param("id")String name);

    @Update("UPDATE meal SET intro = #{intro},img=#{img} WHERE name = #{name} ")
    int Update(@Param("intro")String intro, @Param("img")String img, @Param("name") String name);


}
