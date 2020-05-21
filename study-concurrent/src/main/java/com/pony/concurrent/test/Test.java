package com.pony.concurrent.test;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("0.4");
        BigDecimal b = new BigDecimal("0.5");
        BigDecimal c = new BigDecimal("0.6");
        for (int i = 0; i <7 ; i++) {
            System.out.print(a.setScale(0, i).intValue()+",");
            System.out.print(b.setScale(0, i).intValue()+",");
            System.out.println(c.setScale(0, i).intValue());
        }

    }
}
