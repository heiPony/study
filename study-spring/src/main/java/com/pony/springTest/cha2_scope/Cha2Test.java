package com.pony.springTest.cha2_scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cha2Test {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cha3MainConfig.class);
//        String[] names = app.getBeanDefinitionNames();
//        for (String name : names) {
//            System.out.println(name);
//        }
        System.out.println("IOC 容器加载完成");
        Object bean1 = app.getBean("person");
        Object bean2 = app.getBean("person");
        System.out.println(bean1 == bean2);
    }
}
