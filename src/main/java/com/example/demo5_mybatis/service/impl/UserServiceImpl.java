package com.example.demo5_mybatis.service.impl;

import com.example.demo5_mybatis.mapper.UserMapper;
import com.example.demo5_mybatis.model.entity.User;
import com.example.demo5_mybatis.service.UserService;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> findAll(){
        return userMapper.findAll();
    }

    public User findById(Integer id){
        return userMapper.findById(id);
    }

    public Boolean addUser(@Param("u") User user){ return userMapper.addUser(user); }

    public Boolean updateUserById(@Param("u") User user){return userMapper.updateUserById(user);}

    public Boolean deleteUserById(@Param("id") Integer id){return userMapper.deleteUserById(id);}

    public User findById1(@Param("id") Integer id){return userMapper.findById1(id);}

    public List<User> findAll1(){return userMapper.findAll1();}

    public Boolean addUser1(@Param("u") User user){return userMapper.addUser1(user);}


    public Boolean updateUserById1(@Param("u") User user){return userMapper.updateUserById1(user);}

    public Boolean deleteUserById1(@Param("id") Integer id){return userMapper.deleteUserById1(id);}
}
