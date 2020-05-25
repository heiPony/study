package com.pony.springTest.cha7_bean;

import com.pony.common.pojo.spring.Bike;
import com.pony.common.pojo.spring.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Cha7MainConfig {
    @Bean
    public Person person(){
        System.out.println("给容器中添加 person");
        return new Person("person",20);
    }


    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Bike bike(){
        return new Bike();
    }

}
