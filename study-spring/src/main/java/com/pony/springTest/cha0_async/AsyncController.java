package com.pony.springTest.cha0_async;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AsyncController {

    @Autowired
    AsyncClass asyncClass;

    @RequestMapping("/test")
    public void test(){
        asyncClass.asyncTest();
        System.out.println("主线程结束");
    }
}
