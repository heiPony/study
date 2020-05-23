package com.pony.springTest.cha6_import;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cha6Test {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cha6MainConfig.class);
        System.out.println("IOC 容器创建完成 。。。");
        String[] names = app.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }
}
