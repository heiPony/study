package com.pony.pattern.create.fatory.fatoryMethod;

import com.pony.pattern.entity.Fruit;
import com.pony.pattern.entity.fruit.Apple;

/**
 * 工厂方法模式
 */
public class AppleFactory implements FruitFactory{
    public Fruit getFruit(){
        return new Apple();
    }
}
