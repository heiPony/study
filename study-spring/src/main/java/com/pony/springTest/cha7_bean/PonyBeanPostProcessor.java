package com.pony.springTest.cha7_bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class PonyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        //返回一个对象(Bean)
        //初始化方法调用 之前 进行后置处理(增强)
        System.out.println("Before......."+beanName+"-----"+bean);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        //返回一个对象(Bean)
        //初始化方法调用 之后 进行后置处理(增强)
        System.out.println("After........"+beanName+"-----"+bean);
        return bean;
    }
}
