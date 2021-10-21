package com.example.springboot.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.springboot.common.Result;
import com.example.springboot.entity.User;
import com.example.springboot.mapper.UserMapper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController extends BaseController{

    @Resource
    UserMapper userMapper;

    @PostMapping("/login")
    public Result<?> login(@RequestBody User user) {
        //encode password
        PasswordEncoder encoder = new BCryptPasswordEncoder();
        //select from database
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", user.getUsername());
        User res = userMapper.selectOne(queryWrapper);
        if (res == null) {
            return Result.error("-1", "Username does not exist");
        }
        if(!encoder.matches(user.getPassword(),res.getPassword())){
            return Result.error("-1", "Username or password wrong");
        }
        return Result.success(res);

    }

    @PostMapping("/register")
    public Result<?> register(@RequestBody User user) {
        try {
            PasswordEncoder encoder = new BCryptPasswordEncoder();
            String code = encoder.encode(user.getPassword());
            user.setPassword(code);
            user.setRole(2);
            userMapper.insert(user);
            return Result.success();
        }
        catch (Exception e){
            return Result.error("-1","Register Error");
        }
    }


    @PutMapping
    public Result<?> update(@RequestBody User user) {
        userMapper.updateById(user);
        return Result.success();
    }

    @DeleteMapping("/{id}")
    public Result<?> update(@PathVariable Long id) {
        userMapper.deleteById(id);
        return Result.success();
    }

    @GetMapping("/{id}")
    public Result<?> getById(@PathVariable Long id) {
        return Result.success(userMapper.selectById(id));
    }

    @GetMapping("/all")
    public Result<?> findAll() {
        return Result.success(userMapper.selectList(null));
    }





}
