package com.pony.springTest.cha6_import;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cha6Test {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cha6MainConfig.class);
        Object ponyFactoryBean1 = app.getBean("&ponyFactoryBean");
        Object ponyFactoryBean2 = app.getBean("ponyFactoryBean");
        System.out.println(ponyFactoryBean1.getClass());
        System.out.println(ponyFactoryBean2.getClass());
        System.out.println("IOC 容器创建完成 。。。");
        String[] names = app.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }
}
