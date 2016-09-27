package com.cn.service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lisa on 2016/9/26.
 */
public class Order {

    private int Number;

    public List<OrderItem> Items=new ArrayList<OrderItem>();

    public Order(int number) {
        Number = number;
    }

    public void addItem(String DrinkType,int count,boolean b){
        OrderItem a  = new OrderItem(DrinkType,count,b);
        Items.add(a);
    }

    public List<OrderItem> getItems() {
        return Items;
    }


    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }

    public void setItems(List<OrderItem> items) {
        Items = items;
    }
}
