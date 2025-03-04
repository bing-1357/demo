package com.bing.vueendtest.service;

import com.bing.vueendtest.entity.User;
import com.bing.vueendtest.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;


    public String login(String username, String password) {
        try {
            String result = userMapper.login(username, password);
            return result != null ? "登录成功" : "对不起，用户名或密码错误";
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public String register(String username, String password, String email) {
        try {
            int result = userMapper.register(username, password, email);
            return result != 1 ? "注册失败" : "注册成功";
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
