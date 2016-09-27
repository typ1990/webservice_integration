package com.cn.service;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by lisa on 2016/9/26.
 */
public class Barista {
    private long hotDrinkDelay = 5000;

                 private long coldDrinkDelay = 1000;

                 private AtomicInteger hotDrinkCounter = new AtomicInteger();

                private AtomicInteger coldDrinkCounter = new AtomicInteger();


                 public void setHotDrinkDelay(long hotDrinkDelay) {
                 this.hotDrinkDelay = hotDrinkDelay;
             }

                 public void setColdDrinkDelay(long coldDrinkDelay) {
                 this.coldDrinkDelay = coldDrinkDelay;
             }

                 //处理热饮订单，并生成Drink冷料
                 public Drink prepareHotDrink(OrderItem orderItem) {
//                 try {
//                         Thread.sleep(this.hotDrinkDelay);
                         System.out.println(Thread.currentThread().getName()
                                         + " 准备热饮#" + hotDrinkCounter.incrementAndGet()  + orderItem);
                         return new Drink(1, orderItem.getDrinkType(), orderItem.isIced()
                                         );
//                     } catch (InterruptedException e) {
//                         Thread.currentThread().interrupt();
//                         return null;
//                     }
             }

                 //处理冷饮订单，并生成Drink冷料
                 public Drink prepareColdDrink(OrderItem orderItem) {
//                 try {
//                         Thread.sleep(this.coldDrinkDelay);
                         System.out.println(Thread.currentThread().getName()
                                         + "准备冷饮#" + coldDrinkCounter.incrementAndGet() + orderItem);
                         return new Drink(2, orderItem.getDrinkType(), orderItem.isIced()
                                         );
//                     } catch (InterruptedException e) {
//                        Thread.currentThread().interrupt();
//                         return null;
//                     }
             }
}
