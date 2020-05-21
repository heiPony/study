package com.pony.pattern.create.fatory.fatoryMethod;

import com.pony.pattern.entity.Bag;
import com.pony.pattern.entity.bag.BananaBag;

/**
 * 工厂方法模式
 */
public class BananaBagFactory implements BagFactory{
    public Bag getBag(){
        return new BananaBag();
    }
}
