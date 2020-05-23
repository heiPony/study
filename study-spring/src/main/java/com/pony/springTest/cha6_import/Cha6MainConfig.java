package com.pony.springTest.cha6_import;

import com.pony.common.pojo.spring.Person;
import com.pony.springTest.cha6_import.pojo.Cat;
import com.pony.springTest.cha6_import.pojo.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;

@Configuration
@Import(value = {Dog.class, Cat.class, PonyImportSelector.class})
public class Cha6MainConfig {
    //给容器中注册组件的方式
    //1、@Bean：导入第三方的类或包的组件，比如Person 为第三方的类，需要在我们的IOC容器中使用
    //2、包扫描+组件的标注注解(@ComponentScan ：@Controller,@Service,@Repository,@Component)
    //   一般针对我们自己写的类使用这个
    //注意：@Bean 比较简单
    //3、@Import 快速给容器导入一个组件
    //  a、@Import(要导入到容器中的组件)：容器会自动注册这个组件，bean的 id 为全类名
    //  b、ImportSelector接口：返回需要导入到容器的组件的全类名数组
    @Bean
    public Person person(){
        System.out.println("给容器中添加 person");
        return new Person("person",20);
    }

}
