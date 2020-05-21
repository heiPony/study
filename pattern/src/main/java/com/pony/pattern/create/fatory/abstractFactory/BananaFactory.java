package com.pony.pattern.create.fatory.abstractFactory;

import com.pony.pattern.entity.Bag;
import com.pony.pattern.entity.Fruit;
import com.pony.pattern.entity.bag.BananaBag;
import com.pony.pattern.entity.fruit.Banana;

/**
 * 水果工厂
 */
public class BananaFactory extends AbstractFactory{

    @Override
    public Fruit getFruit() {
        return new Banana();
    }

    @Override
    public Bag getBag() {
        return new BananaBag();
    }
}
