package com.pony.springTest.cha9_autowired;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.stereotype.Component;
import org.springframework.util.StringValueResolver;

@Component
public class Light implements ApplicationContextAware, BeanNameAware, EmbeddedValueResolverAware {

    private ApplicationContext applicationContext;
    @Override
    public void setBeanName(String name) {
        System.out.println("当前Bean的名字："+name);
    }
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("传入的 IOC 容器："+applicationContext);
        this.applicationContext = applicationContext;
        System.out.println("传入的 IOC 容器："+this.applicationContext);
    }
    //解析器
    @Override
    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        String value = resolver.resolveStringValue("你好：${os.name}, 计算4*5 = #{4*5}");
        System.out.println(value);
    }
}
