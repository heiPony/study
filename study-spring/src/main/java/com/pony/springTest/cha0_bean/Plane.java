package com.pony.springTest.cha0_bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Plane implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    //JSR是JDK提供的一组规范
    public Plane() {
        System.out.println("Plane.......constructor............");
    }
    //在Bean创建完成。且属性赋值完成之后进行初始化，属于JDK规范的注解
    @PostConstruct
    public void init(){
        System.out.println("Plane.............@PostConstrut..........");
    }
    //在Bean被移除之前进行通知，在容器销毁之前进行清理工作
    @PreDestroy
    public void destroy(){
        System.out.println("Plane...........@PreDestroy..........");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        //可以通过applicationContext
        this.applicationContext = applicationContext;
    }
}
