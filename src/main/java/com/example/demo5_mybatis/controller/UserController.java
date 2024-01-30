package com.example.demo5_mybatis.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo5_mybatis.model.entity.User;
import com.example.demo5_mybatis.model.pojo.Result;
import com.example.demo5_mybatis.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/findAll")
    public Result findAll(){
        return Result.success(userService.findAll());
    }

    @GetMapping("/findById")
    public Result findById(@RequestParam(value="id") Integer id){
        return Result.success(userService.findById(id));
    }

    @PostMapping("/addUser")
    public Result addUser(@RequestBody User user){ return Result.success(userService.addUser(user)); }

    @PostMapping("/updateUserById")
    public Result updateUserById(@RequestBody User user){return Result.success(userService.updateUserById(user));}

    @PostMapping("/deleteUserById")
    public Result deleteUserById(@RequestParam("id") Integer id){return Result.success(userService.deleteUserById(id));}

    @GetMapping("/findById1")
    public Result findById1(@RequestParam("id") Integer id){return Result.success(userService.findById1(id));}

    @GetMapping("/findAll1")
    public Result findAll1(){
        return Result.success(userService.findAll1());
    }

    @PostMapping("/addUser1")
    public Result addUser1(@RequestBody User user){return Result.success(userService.addUser1(user));}

    @PostMapping("/updateUserById1")
    public Result updateUserById1(@RequestBody User user){return Result.success(userService.updateUserById1(user));}

    @PostMapping("/deleteUserById1")
    public Result deleteUserById1(@RequestParam("id") Integer id){return Result.success(userService.deleteUserById1(id));}
}
