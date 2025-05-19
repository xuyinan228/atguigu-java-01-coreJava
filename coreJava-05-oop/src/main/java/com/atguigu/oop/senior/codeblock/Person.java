package com.atguigu.oop.senior.codeblock;

public class Person {
    private int age;
    private String name;
    public static String INFO = "我是一个人";

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void eat() {
        System.out.println("人吃饭");
    }

    {
        System.out.println("非静态代码块0");
    }

    {
        System.out.println("非静态代码块1");
        age = 1;
    }

    static {
        System.out.println("静态代码块1");
        System.out.println("INFO = " + INFO);
    }

    static {
        System.out.println("静态代码块2");
    }
}
