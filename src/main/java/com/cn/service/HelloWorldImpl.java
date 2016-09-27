package com.cn.service;

/**
 * Created by lisa on 2016/9/26.
 */
public class HelloWorldImpl implements IHelloWorld {

    @Override
    public String sayHello(String text) {

        return "Hello" + text ;
    }
}
