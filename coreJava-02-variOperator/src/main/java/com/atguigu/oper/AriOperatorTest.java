package com.atguigu.oper;

public class AriOperatorTest {
    public static void main(String[] args) {
        // 除法：同号为正，异号为负
        System.out.println( 12 / 5 );
        System.out.println( -12 / 5 );
        System.out.println( 12 / -5 );
        System.out.println( -12 / -5 );

        System.out.println();

        // 取模：看被模数
        System.out.println( 12 % 5 );
        System.out.println( -12 % 5 );
        System.out.println( 12 % -5 );
        System.out.println( -12 % -5 );

        System.out.println();

        int a1 = 10;
        int b1 = ++a1;
        System.out.println("a1 = " + a1);
        System.out.println("b1 = " + b1);

        int a2 = 10;
        int b2 = a2++;
        System.out.println("a2 = " + a2);
        System.out.println("b2 = " + b2);
    }
}
