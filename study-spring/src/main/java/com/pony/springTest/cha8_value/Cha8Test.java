package com.pony.springTest.cha8_value;

import com.pony.common.pojo.spring.Bird;
import com.pony.springTest.cha6_import.Cha6MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class Cha8Test {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cha8MainConfig.class);
        System.out.println("IOC 容器创建完成 。。。");
        String[] names = app.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
        Bird bird = (Bird) app.getBean("bird");
        System.out.println(bird);
    }
}
