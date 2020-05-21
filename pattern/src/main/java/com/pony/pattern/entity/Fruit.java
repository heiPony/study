package com.pony.pattern.entity;

import com.pony.pattern.action.visit.Visit;

/**
 * 水果接口
 */
public interface Fruit {

    int price();

    void draw();

    int accept(Visit visit);

}
