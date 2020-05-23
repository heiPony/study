package com.pony.springTest.cha6_import;

import com.pony.springTest.cha6_import.pojo.Pig;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class PonyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    //AnnotationMetadata：当前类的注解信息
    //BeanDefinitionRegistry：BeanDefinition注册类
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        boolean bean1 = registry.containsBeanDefinition("com.pony.springTest.cha6_import.pojo.Dog");
        boolean bean2 = registry.containsBeanDefinition("com.pony.springTest.cha6_import.pojo.Cat");
        //对于我们要注册的bean，要进行封装；
        if(bean1 && bean2){
            RootBeanDefinition beanDefinition = new RootBeanDefinition(Pig.class);
            registry.registerBeanDefinition("pig",beanDefinition);
        }
    }
}
