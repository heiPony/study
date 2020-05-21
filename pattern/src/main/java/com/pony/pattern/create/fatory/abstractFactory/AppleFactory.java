package com.pony.pattern.create.fatory.abstractFactory;

import com.pony.pattern.entity.Bag;
import com.pony.pattern.entity.Fruit;
import com.pony.pattern.entity.bag.AppleBag;
import com.pony.pattern.entity.fruit.Apple;

/**
 * 水果工厂
 */
public class AppleFactory extends AbstractFactory{

    @Override
    public Fruit getFruit() {
        return new Apple();
    }

    @Override
    public Bag getBag() {
        return new AppleBag();
    }
}
