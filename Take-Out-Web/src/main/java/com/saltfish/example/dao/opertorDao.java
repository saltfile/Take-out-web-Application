package com.saltfish.example.dao;

import com.saltfish.example.pojo.Admin;
import com.saltfish.example.pojo.Opertor;
import com.saltfish.example.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface opertorDao {
    @Results({
            @Result(property = "oid", column = "oid"),
            @Result(property = "accout", column = "accout"),
            @Result(property = "password", column = "password"),
            @Result(property = "weight", column = "weight"),
    })
    @Select("SELECT accout,password,weight FROM opertor")
    List<Opertor> findall();

    @Select("SELECT * FROM opertor WHERE accout = #{id} AND password = #{pw}")
    Opertor find(@Param("id")String accout,@Param("pw")String passwd);

    @Insert("insert into opertor(accout,password)values (#{id},#{password})")
    int insert(@Param("id")String id,@Param("password")String password);

    @Delete("DELETE FROM opertor WHERE accout = #{id}")
    int delete(@Param("id")String id);

    @Update("UPDATE opertor SET password = #{password} WHERE accout = #{old} ")
    int update(@Param("password")String password,@Param("old")String old);

    @Update("UPDATE opertor SET weight = #{weight} WHERE accout = #{old} ")
    int updateQUAN(@Param("weight")boolean weight,@Param("old")String old);

}
