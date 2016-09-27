package com.cn.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by lisa on 2016/9/26.
 */
@WebService
public interface IHelloWorld {
    //@WebParam(name="arg0")可有可无，为了增强可读性
    @WebMethod
    public String sayHello(@WebParam(name="canshu")String text);
}