package com.atguigu.oop.senior.innerclazz.member;

public class InnerClassTest {
    public static void main(String[] args) {
        Person.Dog dog = new Person.Dog();

        Person person = new Person();
        Person.Bird bird = person.new Bird();
    }
}
