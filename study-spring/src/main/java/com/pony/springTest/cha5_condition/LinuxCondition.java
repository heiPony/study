package com.pony.springTest.cha5_condition;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;
public class LinuxCondition implements Condition {

    // ConditionContext：判断条件可以使用的上下文(环境)
    //AnnotatedTypeMetadata：注解信息
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        //是否为windows系统

        //获取IOC容器中正在使用的beanFactory
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
        //获取当前环境变量(包括操作系统)
        Environment environment = context.getEnvironment();
        String os_name = environment.getProperty("os.name");
        if(os_name.contains("Linux")){
            return true;
        }
        return false;
    }
}
