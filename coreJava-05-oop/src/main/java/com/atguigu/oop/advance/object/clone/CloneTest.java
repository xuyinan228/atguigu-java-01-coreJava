package com.atguigu.oop.advance.object.clone;

public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Animal a1 = new Animal("花花");
        Animal a2 = (Animal) a1.clone();

        System.out.println("a1 = " + a1);
        System.out.println("a1.getName() = " + a1.getName());

        System.out.println();

        System.out.println("a2 = " + a2);
        System.out.println("a2.getName() = " + a2.getName());

        System.out.println();

        System.out.println("a1 == a2 = " + (a1 == a2));
    }
}
