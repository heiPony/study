package com.pony.springTest.cha5_condition;

import com.pony.springTest.cha4_lazy.Cha4MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cha5Test {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cha5MainConfig.class);
        System.out.println("IOC 容器创建完成 。。。");

    }
}
