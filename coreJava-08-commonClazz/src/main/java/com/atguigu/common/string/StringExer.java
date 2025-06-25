package com.atguigu.common.string;

import org.junit.Test;

public class StringExer {

    @Test
    public void testCountSubStr() {
        System.out.println(countSubStr("ab", "abkkcadkabkebfkabkskab"));
    }

    private int countSubStr(String target, String source) {
        int count = 0, start = 0;
        int res;
        while( -1 != (res = source.indexOf(target, start)) ) {
            count++;
            start = res + target.length();
        }
        return count;
    }

    @Test
    public void testReverse() {
        String s1 = "abcdefg";
        String s2 = reverse(s1, 2, 5);
        System.out.println("s2 = " + s2);
    }

    private String reverse(String str, int start, int end) {
        char[] chArr = str.toCharArray();
        for(int i = start, j = end; i < j; i++, j--) {
            char temp = chArr[j];
            chArr[j] = chArr[i];
            chArr[i] = temp;
        }
        return new String(chArr);
    }
}
