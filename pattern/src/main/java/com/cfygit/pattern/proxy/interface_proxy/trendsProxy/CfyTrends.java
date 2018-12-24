package com.cfygit.pattern.proxy.interface_proxy.trendsProxy;

public class CfyTrends implements  TrendsBase{
    @Override
    public void trendsJDK(String name){
        System.out.println("cfy is cfy jdk trends inputing code----"+name);
    }
}
