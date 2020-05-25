package com.pony.springTest.cha0_bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Jeep {

    //JSR是JDK提供的一组规范
    public Jeep() {
        System.out.println("Jeep.......constructor............");
    }
    //在Bean创建完成。且属性赋值完成之后进行初始化，属于JDK规范的注解
    @PostConstruct
    public void init(){
        System.out.println("Jeep.............@PostConstrut..........");
    }
    //在Bean被移除之前进行通知，在容器销毁之前进行清理工作
    @PreDestroy
    public void destroy(){
        System.out.println("Jeep...........@PreDestroy..........");
    }
}
