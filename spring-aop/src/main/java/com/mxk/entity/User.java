package com.mxk.entity;

import com.mxk.anno.UserEntity;

/**
 * @ClassName User
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2021/3/10 10:28
 **/
@UserEntity("user")
public class User {

    private String id;

    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
