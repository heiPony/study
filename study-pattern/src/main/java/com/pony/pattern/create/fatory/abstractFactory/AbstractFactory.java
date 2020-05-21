package com.pony.pattern.create.fatory.abstractFactory;

import com.pony.pattern.entity.Bag;
import com.pony.pattern.entity.Fruit;

/**
 * 抽象水果工厂
 */
public abstract class AbstractFactory {

    public abstract  Fruit getFruit();

    public abstract Bag getBag();

}
