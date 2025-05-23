package com.atguigu.oop.senior.innerclazz.member;

public class Person {
    String name = "张三";

    static class Dog {

    }

    class Bird {
        String name = "啄木鸟";

        public void show() {
            System.out.println("name = " + name);
            System.out.println("this.name = " + this.name);
            System.out.println("Person.this.name = " + Person.this.name);
        }
    }
}
