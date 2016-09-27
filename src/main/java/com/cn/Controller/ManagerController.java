package com.cn.Controller;

import com.cn.service.Cafe;
import com.cn.service.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by lisa on 2016/9/26.
 */
@Controller
@RequestMapping("/get")
public class ManagerController {
//    Log log= LogFactory.getLog(ManagerController.class);
    private static Logger log = LoggerFactory.getLogger(ManagerController.class);

    @Autowired
    public Cafe cafe;

    @RequestMapping("/jump")
    public ModelAndView jump() {
        ModelAndView mav = new ModelAndView();
        log.info("*******************你好");
        System.out.println("+++++++++++++++你好");

//        HelloWorldImplService factory = new HelloWorldImplService();
//        com.cn.service.web.IHelloWorld  iHelloWorld= factory.getHelloWorldImplPort();
//
//        String result = helloClient.sayHello("你好!");

//        System.out.println("结果是"+result);

//        for (int i = 1; i <= 10; i++) {i
                         Order order = new Order(1);
                         // 一杯热饮  参数说明1.饮料类型 2.数量 3.是否是冷饮(true表示冷饮)
                         order.addItem("热饮", 2, false);
                         // 一杯冷饮  参数说明1.饮料类型 2.数量 3.是否是冷饮(true表示冷饮)
                         order.addItem("冷饮", 3, true);
                         //下发订单，把消息发给 orders 队列
                         cafe.placeOrder(order);
            System.out.println("进行第1次运行");
//                     }
        mav.setViewName("a");
        return mav;
    }

}
