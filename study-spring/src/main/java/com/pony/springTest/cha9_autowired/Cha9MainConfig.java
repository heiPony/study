package com.pony.springTest.cha9_autowired;

import com.pony.common.pojo.spring.Bird;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(value = {"com.pony.springTest.cha9_autowired"})
public class Cha9MainConfig {

}
