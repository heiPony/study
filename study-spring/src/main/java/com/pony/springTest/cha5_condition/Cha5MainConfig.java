package com.pony.springTest.cha5_condition;

import com.pony.common.pojo.spring.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Cha5MainConfig {

    @Bean
    public Person person(){
        System.out.println("给容器中添加 person");
        return new Person("person",10);
    }

    @Conditional(WinCondition.class)
    @Bean
    public Person pony(){
        System.out.println("给容器中添加 pony");
        return new Person("pony",20);
    }
    @Conditional(LinuxCondition.class)
    @Bean("heiPony")
    public Person heiPony(){
        System.out.println("给容器中添加 heiPony");
        return new Person("heiPony",30);
    }
}
