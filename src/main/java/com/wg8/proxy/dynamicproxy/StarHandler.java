package com.wg8.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Harry
 * @date 2019/4/2 10:18 PM
 */
public class StarHandler implements InvocationHandler {

    private Star realStar;

    public StarHandler(Star realStar) {
        super();
        this.realStar = realStar;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object object = null;

        System.out.println("真正的方法执行前！");
        System.out.println("面谈，签合同，预付款，订机票");

        if ("sing".equals(method.getName())) {
            object = method.invoke(realStar, args);
        } else {
            m
        }

        System.out.println("真正的方法执行后！");
        System.out.println("收尾款");
        return object;
    }
}
