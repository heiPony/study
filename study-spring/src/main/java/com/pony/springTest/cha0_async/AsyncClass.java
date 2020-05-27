package com.pony.springTest.cha0_async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AsyncClass {

    @Async
    public void asyncTest(){
        int time =6000;
        try {
            System.out.println("异步线程睡眠"+time*0.001+"S开始");
            Thread.sleep(time);
            System.out.println("异步线程睡眠"+time*0.001+"S结束");
        } catch (InterruptedException e) {
            System.out.println("-----------");
        }
    }
}
