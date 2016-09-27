package com.cn.service;

/**
 * Created by lisa on 2016/9/26.
 */
public class OrderItem {

    private Order order;

    //饮料类型
    private String  DrinkType;
    //数量
    private int count;
    //是否是冷饮(true表示冷饮)
    private boolean isIced;

    public boolean isIced(){
        return isIced;
    }

    public OrderItem(String drinkType, int count, boolean isIced) {
        DrinkType = drinkType;
        this.count = count;
        this.isIced = isIced;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public String getDrinkType() {
        return DrinkType;
    }

    public void setDrinkType(String drinkType) {
        DrinkType = drinkType;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setIsIced(boolean isIced) {
        this.isIced = isIced;
    }
}
