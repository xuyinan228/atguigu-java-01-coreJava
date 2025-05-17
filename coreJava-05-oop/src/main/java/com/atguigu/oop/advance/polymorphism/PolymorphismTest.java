package com.atguigu.oop.advance.polymorphism;

import java.util.Random;

public class PolymorphismTest {
    public static void main(String[] args) {
        int randomNum = new Random().nextInt(100);

        Person p1 = randomNum > 50 ? new WoMan() : new Man();
        p1.eat();
        p1.walk();

        if( p1 instanceof Man ){
            ((Man) p1).earnMoney();
        } else {
            ((WoMan) p1).shopping();
        }
    }
}
