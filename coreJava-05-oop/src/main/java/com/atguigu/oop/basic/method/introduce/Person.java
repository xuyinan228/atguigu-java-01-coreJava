package com.atguigu.oop.basic.method.introduce;

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

    public String interest(String hobby) {
        return "我的兴趣是：" + hobby;
    }

    public int getAge() {
        return age;
    }
}
