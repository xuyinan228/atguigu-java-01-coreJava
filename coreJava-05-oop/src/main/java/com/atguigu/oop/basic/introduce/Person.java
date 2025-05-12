package com.atguigu.oop.basic.introduce;

public class Person {
    String name;
    int age;
    char gender;

    public void eat() {
        System.out.println("人吃饭");
    }

    public void sleep(int hour) {
        System.out.println("人至少每天" + hour + "小时的睡眠");
    }

    public void interest(String hobby) {
        System.out.println("我的兴趣是：" + hobby);
    }
}
