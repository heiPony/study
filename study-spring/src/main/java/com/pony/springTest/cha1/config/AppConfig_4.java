package com.pony.springTest.cha1.config;

import com.pony.common.pojo.spring.Person;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(value = "com.pony.springTest.cha1",
        includeFilters = {@ComponentScan.Filter(type = FilterType.CUSTOM, classes = {PonyTypeFilter.class})},useDefaultFilters = false)
public class AppConfig_4 {

    @Scope("prototype")
    @Bean
    public Person person(){
        return new Person("Pony",20);
    }
    public static void main(String[] args) {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(AppConfig_4.class);
        String[] names = app.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }
}
