package com.atguigu.oop.basic.field;


public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.introduce();

        p1.name = "Jerry";
        p1.age = 24;
        p1.gender = '男';

        p1.introduce();

        p1.eat();
        p1.sleep(8);

    }
}
