package com.thomas.webdemo.bean;

import java.io.Serializable;

/**
 * Created by Thomas.Wang on 2018/2/8.
 */
public class HelloBean implements Serializable{
    private static final long serialVersionUID = 1L;
    private String name ;
    private String age ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "HelloBean{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
