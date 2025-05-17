package com.atguigu.oop.advance.polymorphism;

public class WoMan extends Person {

    @Override
    public void eat() {
        System.out.println("女人应该少吃，减肥");
    }

    @Override
    public void walk() {
        System.out.println("女人窈窕地走路");
    }

    public void shopping() {
        System.out.println("女人喜欢逛街");
    }
}
