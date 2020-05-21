package com.pony.pattern.create.fatory.abstractFactory;

import com.pony.pattern.entity.Bag;
import com.pony.pattern.entity.Fruit;
import com.pony.pattern.entity.bag.OrangeBag;
import com.pony.pattern.entity.fruit.Orange;

/**
 * 水果工厂
 */
public class OrangeFactory extends AbstractFactory{

    @Override
    public Fruit getFruit() {
        return new Orange("Peter",50);
    }

    @Override
    public Bag getBag() {
        return new OrangeBag();
    }
}
