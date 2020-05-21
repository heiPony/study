package com.pony.pattern.service.impl;

import com.pony.pattern.service.OrderService;

/**
 * 本地订单
 */
public class OrderServiceImpl implements OrderService {
    @Override
    public int saveOrder() {
        System.out.println("下单成功，订单号： 888888");
        return 888888;
    }
}
