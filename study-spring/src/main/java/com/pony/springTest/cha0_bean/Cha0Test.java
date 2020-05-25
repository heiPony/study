package com.pony.springTest.cha0_bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cha0Test {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cha0MainConfig.class);
        System.out.println("IOC 容器创建完成 。。。");
        app.close();
    }
}
