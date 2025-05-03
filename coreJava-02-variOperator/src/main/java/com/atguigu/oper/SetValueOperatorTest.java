package com.atguigu.oper;

public class SetValueOperatorTest {
    public static void main(String[] args) {
        int i1, i2;
        i1 = i2 = 10;
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);

        byte b1 = 127;
        b1 += 1;
        System.out.println("b1 = " + b1);

        int i3 = 1;
        i3 *= 0.1;
        System.out.println("i3 = " + i3);
    }
}
