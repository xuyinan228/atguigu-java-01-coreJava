package com.atguigu.common.string;

import org.junit.Test;

public class StringDemo {

    @Test
    public void test1() {
        String s1 = "hello";
        String s2 = "hello";

        System.out.println(s1 == s2);       //true
    }

    @Test
    public void test2() {
        String s1 = "hello";
        String s2 = "hello";

        String s3 = s2.replace("l", "w");

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
    }

    @Test
    public void test3() {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        String s4 = new String("hello");

        System.out.println("s1 == s2 = " + (s1 == s2));
        System.out.println("s3 == s4 = " + (s3 == s4));
        System.out.println("s1 == s3 = " + (s1 == s3));
    }

    @Test
    public void test4() {
        String s1 = "hello";
        final String s2 = "world";

        String s3 = "helloworld";
        String s4 = "hello" + "world";
        String s5 = s1 + "world";
        String s6 = "hello" + s2;
        String s7 = s1 + s2;

        String s8 = s7.intern();

        System.out.println("s3 == s4 = " + (s3 == s4));
        System.out.println("s3 == s5 = " + (s3 == s5));
        System.out.println("s3 == s6 = " + (s3 == s6));
        System.out.println("s3 == s7 = " + (s3 == s7));
        System.out.println("s5 == s6 = " + (s5 == s6));
        System.out.println("s5 == s7 = " + (s5 == s7));

        System.out.println();

        System.out.println("s3 == s8 = " + (s3 == s8));
    }
}
