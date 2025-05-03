package com.atguigu.varioper;

public class FloatTest {
    public static void main(String[] args) {
        double d1 = 12.3;
        float f1 = 12.3f;

        System.out.println("d1 = " + d1);
        System.out.println("f1 = " + f1);


        System.out.println("0.1 + 0.2 = " + (0.1 + 0.2));

        float ff1 = 123123123F;
        float ff2 = ff1 + 1;
        System.out.println("ff1 = " + ff1);
        System.out.println("ff2 = " + ff2);
        System.out.println("ff1 == ff2 = " + (ff1 == ff2));
    }
}
