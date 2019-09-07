package com.iweb.springbootdemo.entity;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @author yangyi
 * @date 2019/8/31 11:10
 */
@Data   //提供set() get() toString()方法
@Slf4j
public class User {
    private Integer id;
    private String name;
    private Integer score;

    public User() {
    }

    public User(Integer id, String name, Integer score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }
}
