package com.atguigu.oop.advance._this;

public class Person {
    private int age;
    private String name;

    public Person() {
        this(18, "Tom");
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
