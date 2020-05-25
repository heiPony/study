package com.pony.springTest.cha1.config;

import com.pony.common.pojo.spring.Person;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Service;

@Configuration
@ComponentScan(value = "com.pony.springTest.cha1", includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Service.class})},
        useDefaultFilters = false)
public class AppConfig_2 {

    @Scope("prototype")
    @Bean
    public Person person(){
        return new Person("Pony",20);
    }
    public static void main(String[] args) {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(AppConfig_2.class);
        String[] names = app.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }
}
