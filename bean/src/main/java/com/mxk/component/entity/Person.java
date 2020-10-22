package com.mxk.component.entity;


import org.springframework.stereotype.Component;

/**
* @Description: 人员
* @Param:
* @return:
* @Author: ma.kangkang
* @Date: 2020/10/21
*/
@Component
public class Person {

    private String personName;

    private String personAge;

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonAge() {
        return personAge;
    }

    public void setPersonAge(String personAge) {
        this.personAge = personAge;
    }
}
