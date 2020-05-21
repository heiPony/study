package com.pony.pattern.create.fatory.fatoryMethod;

import com.pony.pattern.entity.Fruit;
import com.pony.pattern.entity.fruit.Orange;

/**
 * 工厂方法模式
 */
public class OrangeFactory implements FruitFactory{
    public Fruit getFruit(){
        return new Orange("Peter",80);
    }
}
