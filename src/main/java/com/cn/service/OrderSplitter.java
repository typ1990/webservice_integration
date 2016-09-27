package com.cn.service;

import java.util.List;

/**
 * Created by lisa on 2016/9/26.
 */
public class OrderSplitter {
    // 接收 从 orders队列接收的 order 消息后，调用 order.getItems方法
           // 进行订单的分解, 返回的List<OrderItem>可会，被拆分为多个消息后(Message.payLoad)，发到指定队列
                  public List<OrderItem> split(Order order) {
                   return  order.getItems();
                  }

}
