package com.pony.springTest.cha4_lazy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cha4Test {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cha4MainConfig.class);
        System.out.println("IOC 容器创建完成 。。。");
        Object bean1 = app.getBean("person");
        Object bean2 = app.getBean("person");
        System.out.println(bean1 == bean2);
    }
}
