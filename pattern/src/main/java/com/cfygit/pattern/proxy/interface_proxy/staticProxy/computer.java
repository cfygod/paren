package com.cfygit.pattern.proxy.interface_proxy.staticProxy;

public class computer implements InterfaceBase {
    private cfy cfyDemo;

    public computer(cfy cfyDemo) {
        this.cfyDemo = cfyDemo;
    }

    @Override
    public void inputCodeByPerson(String name) {
        System.out.println("computerProxy is puting code");
        cfyDemo.inputCodeByPerson(name);
        System.out.println("computerProxy is end puting code");
    }

}
