package com.atguigu.typecast;

public class AutoCastTest {
    public static void main(String[] args) {
        int i1 = 10;
        int i2 = i1;

        long l1 = i1;

        float f1 = i1;

        byte b1 = 12;
        int i3 = b1 + i1;


        byte b3 = 12;
        short s1 = 10;
        int i4 = b3 + s1;

        char c1 = 'a';
        int i5 = c1 + b3;

        int i6 = b3 + b3;
    }
}
