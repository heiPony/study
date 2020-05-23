package com.pony.springTest.cha1.config;

import com.pony.common.pojo.spring.Person;
import com.pony.springTest.cha1.controller.TestController;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@ComponentScan(basePackages = "com.pony.springTest.cha1.*",
        useDefaultFilters = false)
public class AppConfig_1 {

    @Scope("prototype")
//    @Bean
    public Person person(){
        return new Person("Pony",20);
    }
    public static void main(String[] args) {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(AppConfig_1.class);
        String[] names = app.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }



}
