package com.atguigu.oop.basic.constructor;

public class Person {
    private String name;
    private int age;

    public Person() {}
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("人吃饭");
    }
}
