package com.atguigu.oop.basic.method.recursion;

public class RecursionTest {
    public static void main(String[] args) {
        System.out.println("100! = " + calc(100));
    }

    private static int calc(int n) {
        if( n == 1 ) {
            return 1;
        }
        return n + calc(n-1);
    }
}
