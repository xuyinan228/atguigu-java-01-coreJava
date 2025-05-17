package com.atguigu.oop.advance.polymorphism;

public class Man extends Person {
    private boolean smoke;

    @Override
    public void eat() {
        System.out.println("男人多吃肉，长肌肉");
    }

    @Override
    public void walk() {
        System.out.println("男人笔挺地走路");
    }

    public void earnMoney() {
        System.out.println("男人赚钱养家");
    }
}
