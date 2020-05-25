package com.pony.mytest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class MyTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyTestApplication.class, args);
        AsyncTest asyncTest = new AsyncTest();
        Java8 java8 = new Java8();
        asyncTest.str();
        java8.test();
    }

}
