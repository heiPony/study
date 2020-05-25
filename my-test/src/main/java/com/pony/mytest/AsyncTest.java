package com.pony.mytest;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncAnnotationBeanPostProcessor;
public class AsyncTest extends AsyncAnnotationBeanPostProcessor {

    @Async
    public void str(){
        try {
            System.out.println("async");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }
    }
}
