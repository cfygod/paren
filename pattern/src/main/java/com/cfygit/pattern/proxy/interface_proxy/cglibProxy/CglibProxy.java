package com.cfygit.pattern.proxy.interface_proxy.cglibProxy;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglibProxy前");
        Object re = methodProxy.invokeSuper(o,objects);
        System.out.println("cglibProxy后");
        return re;
    }
}
