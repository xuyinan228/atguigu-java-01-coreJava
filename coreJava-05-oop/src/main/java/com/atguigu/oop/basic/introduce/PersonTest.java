package com.atguigu.oop.basic.introduce;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Jerry";
        p1.age = 24;
        p1.gender = '男';

        System.out.println("p1.name = " + p1.name + ", p1.age = " + p1.age + ", p1.gender = " + p1.gender);

        p1.eat();
        p1.sleep(8);
        p1.interest("玩游戏");

        Person p2 = new Person();
        p2.name = "Tom";
        p2.age = 18;
        p2.gender = '女';
        System.out.println("p2.name = " + p2.name + ", p2.age = " + p2.age + ", p2.gender = " + p2.gender);

        Person p3 = p1;
        p3.age = 22;
        System.out.println("p1.name = " + p1.name + ", p1.age = " + p1.age + ", p1.gender = " + p1.gender);
    }
}
