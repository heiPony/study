package com.pony.springTest.cha10_aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//日志切面类
@Aspect
public class PonyAspects {
    @Pointcut("execution(public int com.pony.springTest.cha10_aop.Calculator.*(..))")
    public void pointCut() {
    }

    @Before("execution(public int com.pony.springTest.cha10_aop.Calculator.div(int, int))")
    public void logStart(JoinPoint joinPoint) {
        System.out.println("执行的方法名：" + joinPoint.getSignature().getName());
        System.out.println("执行方法参数：" + Arrays.asList(joinPoint.getArgs()));
    }

//    @Before("pointCut()")
//    public void logStart_1() {
//        System.out.println("logStart_1");
//    }
//
//    @Before("execution(public int com.pony.springTest.cha10_aop..*(..))")
//    public void logStart_2() {
//        System.out.println("logStart_2");
//    }
//
//    @Before("execution(public int com.pony.springTest.cha10_aop.Calculator.*(..))")
//    public void logStart_3() {
//        System.out.println("logStart_3");
//    }

    @After("pointCut()")
    public void logEnd(JoinPoint joinPoint) {
        System.out.println("执行方法结果：" + joinPoint.getSignature().getModifiers());
    }

    @AfterReturning(value = "pointCut()", returning = "result")
    public void logReturn(Object result) {
        System.out.println("返回结果：" + result);
    }

    @AfterThrowing(value = "pointCut()", throwing = "exception")
    public void logException(Exception exception) {
        System.out.println("除法异常信息：" + exception);
    }

    @Around("pointCut()")
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("logAround..执行之前....");
        Object obj = joinPoint.proceed();
        System.out.println("logAround..执行之后....");
        return obj;
    }

}
