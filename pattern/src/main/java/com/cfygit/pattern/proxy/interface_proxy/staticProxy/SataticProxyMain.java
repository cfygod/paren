package com.cfygit.pattern.proxy.interface_proxy.staticProxy;

public class SataticProxyMain {

    /**
     * java的静态代理模式：
     * 拥有统一的接口，都会去实现他，
     * 但是不会直接调用，会在代理类里面去调用，
     * 这样做的好处是 如果增加操作可以直接在代理类里面去书写
     * 之所以叫静态的是因为是在代码编译的时候就已经代理（aop了）
     * 参考：https://www.cnblogs.com/gonjan-blog/p/6685611.html
     * @param args
     */
    public static void main(String[] args) {
        cfy cfyDemo = new cfy();
        computer computerDemo = new computer(cfyDemo);
        computerDemo.inputCodeByPerson("测试");
    }
}
