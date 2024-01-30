package com.example.demo5_mybatis.mapper;


import com.example.demo5_mybatis.model.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserMapper {
    @Select("select * from user where id = #{id}")
    public User findById(@Param("id") Integer id);

    @Select("select * from user")
    public List<User> findAll();

    @Insert("insert into user('name','password','age','tel') values(#{u.name},#{u.password},#{u.age},#{u.tel})")
    public Boolean addUser(@Param("u") User user);

    @Update("update user set name = #{u.name}, age = #{u.age} ,tel = #{u.tel} where id = #{u.id}")
    public Boolean updateUserById(@Param("u") User user);

    @Delete("delete from user where id = #{id}")
    public Boolean deleteUserById(@Param("id") Integer id);

    public User findById1(@Param("id") Integer id);

    public List<User> findAll1();

    public Boolean addUser1(@Param("u") User user);

    public Boolean updateUserById1(@Param("u") User user);

    public Boolean deleteUserById1(@Param("id") Integer id);
}


