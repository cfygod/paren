package com.cfygit.pattern.enumdemo;

public enum  EnumDemo {
    SUCCESS(1,"ok"),FAIL(2,"ERROR");
    private int keyInt;
    private String value;

    private EnumDemo(int keyInt,String value){
        this.keyInt = keyInt;
        this.value = value;
    }

    public int getKeyInt() {
        return keyInt;
    }

    public void setKeyInt(int keyInt) {
        this.keyInt = keyInt;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
