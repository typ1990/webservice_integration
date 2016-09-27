package com.cn.service;

/**
 * Created by lisa on 2016/9/26.
 */
public class DrinkRouter {
    //从 drinks队列的消息后，根据orderItem的属性,选择路由到不同的队列 coldDrinks或hotDrinks
         public String resolveOrderItemChannel(OrderItem orderItem) {
                 return (orderItem.isIced()) ? "coldDrinks" : "hotDrinks";
             }
}
