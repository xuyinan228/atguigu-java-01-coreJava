package com.atguigu.oop.basic.field;

public class Person {
    String name;
    int age;
    char gender;

    public void eat() {
        String food = "宫保鸡丁";
        System.out.println("我喜欢吃" + food);
    }

    public void sleep(int hour) {
        System.out.println("人至少每天" + hour + "小时的睡眠");
    }

    public void introduce() {
        System.out.println("name: " + name + ", age: " + age + ", gender: " + gender);
    }
}
