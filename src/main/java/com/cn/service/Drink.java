package com.cn.service;

/**
 * Created by lisa on 2016/9/26.
 */
public class Drink {

    public int orderNumber;
    public String DrinkType;
    public boolean isIced;

    public Drink(int orderNumber, String drinkType, boolean isIced) {
        this.orderNumber = orderNumber;
        DrinkType = drinkType;
        this.isIced = isIced;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getDrinkType() {
        return DrinkType;
    }

    public void setDrinkType(String drinkType) {
        DrinkType = drinkType;
    }

    public boolean isIced() {
        return isIced;
    }

    public void setIsIced(boolean isIced) {
        this.isIced = isIced;
    }
}
