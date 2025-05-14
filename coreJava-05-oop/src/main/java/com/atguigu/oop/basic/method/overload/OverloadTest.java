package com.atguigu.oop.basic.method.overload;

public class OverloadTest {

    public static void main(String[] args) {
        System.out.println(add(1, 2));

        System.out.println();

        System.out.println(add(1, 2.0));
    }

    public static int add(int a, int b) {
        System.out.println("1111");
        return a + b;
    }

    public static double add(double a, double b) {
        System.out.println("2222");
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }
}
