package com.pony.pattern.create.fatory.fatoryMethod;

import com.pony.pattern.entity.Bag;
import com.pony.pattern.entity.bag.AppleBag;

/**
 * 工厂方法模式
 */
public class AppleBagFactory implements BagFactory{
    public Bag getBag(){
        return new AppleBag();
    }
}
