package com.pony.springTest.cha7_bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cha7Test {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cha7MainConfig.class);
        System.out.println("IOC 容器创建完成 。。。");
        app.close();
    }
}
