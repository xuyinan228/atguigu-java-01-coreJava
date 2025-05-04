package com.atguigu.flowcontrol.loop;

public class WhileTest {
    public static void main(String[] args) {
        int num = 100;
        while( num < 1000 ) {
            if( match(num) ) {
                System.out.println(num);
            }
            num++;
        }
    }

    private static boolean match(int num) {
        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100;
        return ge * ge * ge + shi * shi * shi + bai * bai * bai == num;
    }
}
