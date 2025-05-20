package com.atguigu.oop.senior._interface.conflict.method;

public class Son extends Father implements Friend {
    @Override
    public void date() {
        //(1)不重写默认保留父类的
        //(2)调用父类被重写的
        super.date();
        //(3)保留父接口的
        Friend.super.date();
        //(4)完全重写
        System.out.println("跟康师傅学Java");
    }
}
