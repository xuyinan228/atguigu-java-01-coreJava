package com.atguigu.common.math;

import java.math.BigInteger;

public class BigIntegerTest {
    public static void main(String[] args) {
        BigInteger b1 = new BigInteger("12345678912345678912345678");
        BigInteger b2 = new BigInteger("78923456789123456789123456789");

        System.out.println("b1.add(b2) = " + b1.add(b2));
        System.out.println("b1.subtract(b2) = " + b1.subtract(b2));
        System.out.println("b1.multiply(b2) = " + b1.multiply(b2));
        System.out.println("b1.divide(b2) = " + b1.divide(b2));
        System.out.println("b1.mod(b2) = " + b1.mod(b2));
    }
}
