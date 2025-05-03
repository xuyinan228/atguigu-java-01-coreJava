package com.atguigu.typecast;

public class ForceCastTest {
    public static void main(String[] args) {
        double d1 = 12;

        int i1 = (int) d1;
        System.out.println("i1 = " + i1);

        long l1 = 123;
        short s1 = (short) l1;
        System.out.println("s1 = " + s1);

        double d2 = 12.3;
        int i2 = (int) d2;
        System.out.println("i2 = " + i2);

        int i3 = 128;
        byte b1 = (byte) i3;
        System.out.println("b1 = " + b1);
    }
}
