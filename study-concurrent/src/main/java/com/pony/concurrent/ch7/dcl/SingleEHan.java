package com.pony.concurrent.ch7.dcl;

/**
 * @author
 * 饿汉式
 */
public class SingleEHan {
    public static SingleEHan singleEHan = new SingleEHan();
    private SingleEHan(){}

}
