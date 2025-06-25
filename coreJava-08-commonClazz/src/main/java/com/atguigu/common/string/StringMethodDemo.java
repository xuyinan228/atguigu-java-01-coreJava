package com.atguigu.common.string;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringMethodDemo {
    @Test
    public void test1() {
        String s1 = new String();
        String s2 = new String("");

        String s3 = new String(new char[]{'a', 'b', 'c'});
        System.out.println("s3 = " + s3);
    }

    @Test
    public void test2() {
        String s1 = "hello";
        char[] chArray = s1.toCharArray();
        System.out.println("chArray = " + Arrays.toString(chArray));
    }

    @Test
    public void test3() throws UnsupportedEncodingException {
        String s1 = "hello 中国";
        byte[] buffer = s1.getBytes();
        System.out.println("buffer = " + Arrays.toString(buffer));
        System.out.println("new String(buffer) = " + new String(buffer));

        System.out.println();

        buffer = s1.getBytes("GBK");
        System.out.println("GBK buffer = " + Arrays.toString(buffer));
        System.out.println("new String(buffer, \"GBK\") = " + new String(buffer, "GBK"));
    }
}
