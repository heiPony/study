package com.pony.springTest.cha7_bean;

import com.pony.common.pojo.spring.Bike;
import com.pony.common.pojo.spring.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(value = "com.pony.springTest.cha7_bean")
@Configuration
public class Cha7MainConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Bike bike(){
        System.out.println("给容器中添加 bike");
        return new Bike();
    }
}
