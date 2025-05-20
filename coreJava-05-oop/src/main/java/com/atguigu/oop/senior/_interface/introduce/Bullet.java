package com.atguigu.oop.senior._interface.introduce;

public class Bullet implements Flyable, Attackable {
    @Override
    public void attack() {
        System.out.println("子弹可以击穿身体");
    }

    @Override
    public void fly() {
        System.out.println("让子弹飞一会");
    }
}
