package com.cn.service;

import java.util.List;

/**
 * Created by lisa on 2016/9/26.
 */
public class Waiter {

    public Delivery prepareDelivery(List<Drink> drinks) {
                 return new Delivery(drinks);
             }
}
