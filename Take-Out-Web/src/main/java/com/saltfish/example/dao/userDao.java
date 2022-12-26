package com.saltfish.example.dao;

import com.saltfish.example.pojo.Admin;
import com.saltfish.example.pojo.User;
import lombok.Data;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface userDao {
    @Results({
            @Result(property = "tel", column = "tel"),
            @Result(property = "password", column = "password"),
            @Result(property = "weight", column = "weight"),
    })
    @Select("SELECT tel,password,weight FROM user")
    List<User> findAll();


    @Select("SELECT * FROM user WHERE tel = #{id}")
    User find(@Param("id")String accout);

    @Insert("insert into user(tel,password)values (#{id},#{password})")
    int insert(@Param("id")String id,@Param("password")String password);

    @Delete("DELETE FROM user WHERE tel = #{id}")
    int delete(@Param("id")String id);

    @Update("UPDATE user SET password=#{password}WHERE tel = #{old} ")
    int update( @Param("password")String password,@Param("old")String tel);

    //禁用（启用）用户
    @Update("UPDATE user SET weight=#{weight}WHERE tel = #{old} ")
    int update_weight( @Param("weight")int weight,@Param("old")String tel);

}
