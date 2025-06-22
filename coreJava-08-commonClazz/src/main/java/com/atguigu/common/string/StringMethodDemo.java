package com.atguigu.common.string;

import org.junit.Test;

public class StringMethodDemo {
    @Test
    public void test1() {
        String s1 = new String();
        String s2 = new String("");

        String s3 = new String(new char[]{'a', 'b', 'c'});
        System.out.println("s3 = " + s3);
    }
}
