package com.pony.springTest.cha2.config;

import com.pony.springTest.cha1.config.PonyTypeFilter;
import com.pony.springTest.cha1.controller.TestController;
import com.pony.springTest.cha2.pojo.Person;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(value = "com.pony.springTest.cha2",
        includeFilters = {/*@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Service.class}),*/
                @ComponentScan.Filter(type = FilterType.CUSTOM, classes = {PonyTypeFilter.class})},
        excludeFilters = {@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {TestController.class})},
        useDefaultFilters = false)
public class AppConfig {

    @Scope("prototype")
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
        Object person1 = app.getBean("person");
        Object person2 = app.getBean("person");
        System.out.println(person1 == person2);
    }
}
