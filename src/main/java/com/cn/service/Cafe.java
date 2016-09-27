package com.cn.service;


import org.springframework.integration.annotation.Gateway;

/**
 * Created by lisa on 2016/9/26.
 */
public   interface  Cafe {

    // 定义GateWay, 把消息发送到 orders 队列, Message的payLoad属性，保存 order参数值
    @Gateway(requestChannel = "orders" )
    void  placeOrder(Order order);

}
