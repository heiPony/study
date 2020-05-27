package com.pony.springTest.cha8_value;

import com.pony.common.pojo.spring.Bird;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:application.properties")
public class Cha8MainConfig {
    @Bean
    public Bird bird(){
        return new Bird();
    }

}
