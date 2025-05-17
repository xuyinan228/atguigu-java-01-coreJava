package com.atguigu.oop.advance.polymorphism;

public class PolymorphismTest {
    public static void main(String[] args) {
        Person p1 = new WoMan();
        p1.eat();
        p1.walk();

        if( p1 instanceof Man ){
            ((Man) p1).earnMoney();
        } else if( p1 instanceof WoMan){
            ((WoMan) p1).shopping();
        }
    }
}
