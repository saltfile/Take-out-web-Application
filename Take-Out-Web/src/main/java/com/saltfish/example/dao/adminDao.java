package com.saltfish.example.dao;

import com.saltfish.example.pojo.Admin;
import org.apache.ibatis.annotations.*;

import java.sql.Time;
import java.util.List;

@Mapper
public interface adminDao {

    @Results({
            @Result(property = "accout", column = "accout"),
            @Result(property = "password", column = "password"),
            @Result(property = "weight", column = "weight"),
    })
    @Select("SELECT accout,password,weight FROM admin")
    List<Admin> findAll();



    @Select("SELECT * FROM admin WHERE accout = #{id} AND password = #{pw}")
    Admin find(@Param("id")String accout,@Param("pw")String passwd);

    @Insert("insert into admin(accout,password)values (#{id},#{password})")
    int insert(@Param("id")String id,@Param("password")String password);

    @Delete("DELETE FROM admin WHERE accout = #{id}")
    int Delete(@Param("id")int id);

    @Update("UPDATE admin SET accout=#{id},password = #{password}WHERE accout = #{old} ")
    int Update(@Param("id")String id, @Param("password")String password,@Param("old")String old);




}
