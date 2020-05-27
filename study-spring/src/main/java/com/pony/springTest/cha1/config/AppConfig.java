package com.pony.springTest.cha1.config;

import com.pony.common.pojo.spring.Person;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(value = "com.pony.springTest.cha1",
        excludeFilters = {@ComponentScan.Filter(type = FilterType.CUSTOM, classes = {PonyTypeFilter.class})})
public class AppConfig {

//    @Scope("prototype")
    @Bean
    public Person person(){
        return new Person("Pony",20);
    }
    public static void main(String[] args) {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
        String[] names = app.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }
}
