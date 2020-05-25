package com.pony.springTest.cha0_bean;

import com.pony.common.pojo.spring.Person;
import com.pony.springTest.cha6_import.PonyImportBeanDefinitionRegistrar;
import com.pony.springTest.cha6_import.PonyImportSelector;
import com.pony.springTest.cha6_import.pojo.Cat;
import com.pony.springTest.cha6_import.pojo.Dog;
import org.springframework.context.annotation.*;

@ComponentScan(value = "com.pony.springTest.cha0_bean")
@Configuration
public class Cha0MainConfig {
    @Bean
    public Person person(){
        System.out.println("给容器中添加 person");
        return new Person("person",20);
    }
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Bike bike(){
        System.out.println("给容器中添加 bike");
        return new Bike();
    }
}
