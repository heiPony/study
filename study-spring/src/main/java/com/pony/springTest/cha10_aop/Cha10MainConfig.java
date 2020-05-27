package com.pony.springTest.cha10_aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//日志切面类的方法需要动态感知div()方法运行
//通知方法：
//  前置通知：logStart()：执行div()开始之前运行(@Before)
//  后置通知：logEnd()：div()结束之后运行，不管有没有异常(@After)
//  返回通知：logReturn()：div()正常返回后运行(@AfterReturning)
//  异常通知：logException()：div()正常出现异常后运行(@AfterThrowing)
//  环绕通知：动态代理，手动执行 joinPoint.proceed()(开始之前，结束之前);(@Around)
@Configuration
@EnableAspectJAutoProxy
public class Cha10MainConfig {
    @Bean
    public Calculator calculator(){
        return new Calculator();
    }
    @Bean
    public PonyAspects ponyAspects(){
        return new PonyAspects();
    }


    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Cha10MainConfig.class);
        Calculator bean = context.getBean(Calculator.class);
        System.out.println(bean.div(4, 2));
    }

}
