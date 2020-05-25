package com.pony.common.pojo.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Train implements InitializingBean, DisposableBean {

    public Train() {
        System.out.println("Train..........constructor........");
    }
    //Bean 销毁时调用此方法
    @Override
    public void destroy() throws Exception {
        System.out.println("Train.........destroy.........");
    }

    //Bean 赋值、初始化之后调用
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Train.......afterPropertiesSet.......");
    }
}
