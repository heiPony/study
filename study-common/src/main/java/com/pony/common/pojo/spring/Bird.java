package com.pony.common.pojo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Bird {

    //使用@Value 进行赋值：1、基本字符，springEL表达式，3、可以读取配置文件
    @Value("pony")
    private String name;
    @Value("#{20-2}")
    private Integer age;
    @Value("${bird.color}")
    private String color;
    @Autowired

    public Bird() {
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
