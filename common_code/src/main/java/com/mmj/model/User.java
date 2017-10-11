package com.mmj.model;

import java.io.Serializable;

/*******************************************************************************
 * Copyright (c) 2017 daixinlian.com
 *
 * All rights reserved. 
 *
 * Contributors:
 *   Miller Ming - Initial implementation
 *   2017/10/8
 *******************************************************************************/
public class User  implements Serializable{

    private Integer id; //编号
    private String  name; //名称
    private Integer age; //年龄
    private Integer gender; //性别

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }
}
