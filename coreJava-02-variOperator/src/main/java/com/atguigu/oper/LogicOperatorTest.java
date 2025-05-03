package com.atguigu.oper;

public class LogicOperatorTest {
    public static void main(String[] args) {
        boolean b1 = false;
        int num1 = 10;
        if( b1 & (num1++ > 0 ) ) {
            System.out.println("床前明月光");
        } else {
            System.out.println("我是郭德纲");
        }
        System.out.println("num1 = " + num1);

        System.out.println();

        boolean b2 = false;
        int num2 = 10;
        if( b2 && (num2++ > 0 ) ) {
            System.out.println("床前明月光");
        } else {
            System.out.println("我是郭德纲");
        }

        System.out.println("num2 = " + num2);
    }
}
