package com.pony.springTest.cha2_scope;

import com.pony.common.pojo.spring.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Cha3MainConfig {

//    @Scope("singleton")
//    @Scope("prototype")
//    @Bean
//    public Person person(){
//        System.out.println("创建实例 person");
//        return new Person("Pony",20);
//    }

}
