package com.pony.springTest.cha1.config;

import com.pony.springTest.cha1.controller.TestController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(value = "com.pony.springTest.cha1",
        includeFilters = {/*@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Service.class}),*/
                @ComponentScan.Filter(type = FilterType.CUSTOM, classes = {PonyTypeFilter.class})},
        excludeFilters = {@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {TestController.class})},
        useDefaultFilters = false)
public class AppConfig {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
        String[] names = app.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }
}
