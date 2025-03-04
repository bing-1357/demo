package com.bing.vueendtest.entity;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String username;
    private String password;
    private String email;
    private String created_at;
    private String updated_at;

}
