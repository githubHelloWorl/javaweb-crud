package com.example.demo5_mybatis.service;

import com.example.demo5_mybatis.mapper.UserMapper;
import com.example.demo5_mybatis.model.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {

    public List<User> findAll();

    public User findById(Integer id);
    
    public Boolean addUser(User user);

    public Boolean updateUserById(User user);

    public Boolean deleteUserById(Integer id);

    public User findById1(Integer id);

    public List<User> findAll1();

    public Boolean addUser1(User user);


    public Boolean updateUserById1(User user);

    public Boolean deleteUserById1(Integer id);
    
    
}
