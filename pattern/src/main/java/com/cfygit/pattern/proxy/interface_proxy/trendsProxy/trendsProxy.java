package com.cfygit.pattern.proxy.interface_proxy.trendsProxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class trendsProxy {
    /**
     * java的动态代理 分为jdk的动态代理模式和cglib代理模式
     * 下面的是jdk的动态代理模式
     * 动态代理模式，是在运行后，也可以理解成，编译后，正在运行
     * 然后去做的代理，
     * 需要 创建一个实现jdk中的invacationHandler的接口，和一个proxy的代理对象
     * 原理是利用clone方法和invoke 即 反射机制，进行了加载（这里又要说下 加载calss时的静态代码和 运行时的 属性赋值）
     * 然后执行
     * jdk代理和cglib 代理
     * 区别起来 就是 jdk 代理必须有统一的顶层接口，cglib不需要可以直接用类。jdk代理用到了反射机制和动态生成字节码技术，cglib是不能继承final类的，只是使用了字节码技术
     * 在spring的应用中默认是jdk动态代理，如果直接一个类，那么是cglib代理。
     * cglib动态代理模式：会在加载的
     *
     * 参考：
     * http://www.cnblogs.com/hongxinlaoking/p/4684652.html
     * https://www.cnblogs.com/chentingk/p/6433372.html
     * https://blog.csdn.net/doujinlong1/article/details/80680149
     *
     * 下面是java的反射机制
     * 参考：
     *
     * http://www.cnblogs.com/hongxinlaoking/p/4684652.html
     *
     * @param args
     */
    public static void main(String[] args) {
        //新建一个原始的对象
        TrendsBase trendsBase = new CfyTrends();

        //新建一个invocationHandle 的接口
        InvocationHandler mydemo = new MyInvocationHandler<TrendsBase>(trendsBase);
        //创建一个代理原始对象的代理类
        TrendsBase trendsBaseProxy = (TrendsBase) Proxy.newProxyInstance(TrendsBase.class.getClassLoader()
                ,new Class[]{TrendsBase.class}
                ,mydemo);
        trendsBaseProxy.trendsJDK("jdk代理");

        //反射机制测试
        try {
            //找类
            Class c= Class.forName("com.cfygit.pattern.proxy.interface_proxy.trendsProxy.CfyTrends");
            //找方法
            Method m = c.getDeclaredMethod("trendsJDK",String.class);
            //通过反射执行，初始化
            Object o = c.newInstance();
            //调用o对象的m方法
                Object result = m.invoke(o,"fanshe");
            System.out.println(result); //true
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (NoSuchMethodException e) {
            e.printStackTrace();
        }catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
