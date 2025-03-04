package com.bing.vueendtest.mapper;

import com.bing.vueendtest.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    //登录
    String login(@Param("username") String username, @Param("password") String password);

    //注册
    int register(@Param("username") String username, @Param("password") String password, @Param("email") String email);
}
