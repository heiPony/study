package com.pony.springTest.cha6_import;

import com.pony.common.pojo.spring.Monkey;
import org.springframework.beans.factory.FactoryBean;

public class PonyFactoryBean implements FactoryBean {
    @Override
    public Object getObject() throws Exception {
        return new Monkey();
    }

    @Override
    public Class<?> getObjectType() {
        return Monkey.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
