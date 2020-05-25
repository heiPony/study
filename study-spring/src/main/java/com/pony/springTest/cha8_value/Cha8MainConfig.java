package com.pony.springTest.cha8_value;

import com.pony.common.pojo.spring.Bird;
import com.pony.common.pojo.spring.Person;
import com.pony.springTest.cha6_import.PonyImportBeanDefinitionRegistrar;
import com.pony.springTest.cha6_import.PonyImportSelector;
import com.pony.springTest.cha6_import.pojo.Cat;
import com.pony.springTest.cha6_import.pojo.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:application.properties")
public class Cha8MainConfig {
    @Bean
    public Bird bird(){
        return new Bird();
    }

}
