package com.cfygit.pattern.proxy.interface_proxy.cglibProxy;

import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.cglib.proxy.Enhancer;



public class cglibMain {
    /**
     * cglib的动态代理
     * 参考：
     * https://blog.csdn.net/yhl_jxy/article/details/80633194
     * @param args
     */
    public static void main(String[] args) {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "D:");
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(CfyCgibBase.class);
        enhancer.setCallback(new CglibProxy());
        //创建代理对象
        CfyCgibBase cfyCgibBase = (CfyCgibBase) enhancer.create();
        cfyCgibBase.cglibCfy("1111111");
    }
}
