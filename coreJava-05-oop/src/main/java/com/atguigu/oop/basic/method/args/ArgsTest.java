package com.atguigu.oop.basic.method.args;

public class ArgsTest {

    public static void main(String[] args) {
        print(1);

        System.out.println();

        print(1,2,3);

        System.out.println();

        print();
    }

    public static void print(int num) {
        System.out.println("num = " + num);
    }

    public static void print(int... nums) {
        System.out.println("可变形参");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + "\t");
        }
        System.out.println();
    }
}
