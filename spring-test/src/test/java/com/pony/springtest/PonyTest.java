package com.pony.springtest;

import com.pony.springtest.cha1.config.AppConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PonyTest {

    @Test
    public void Test1() {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
        String[] names = app.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }

    }
}
