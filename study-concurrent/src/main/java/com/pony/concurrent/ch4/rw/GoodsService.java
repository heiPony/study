package com.pony.concurrent.ch4.rw;

/**
 *@author
 *
 *类说明：商品的服务的接口
 */
public interface GoodsService {

	public GoodsInfo getNum();//获得商品的信息
	public void setNum(int number);//设置商品的数量
}
