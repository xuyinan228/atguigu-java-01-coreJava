package com.atguigu.trycatchfinally;

public class FinallyTest {
    public static void main(String[] args) {
        int result = test1("a");
        System.out.println(result);

        System.out.println();

        System.out.println(test2(10));
    }

    public static int test2(int num) {
        try {
            return num;
        }finally {
            System.out.println("test2结束");
            ++num;
        }
    }

    public static int test1(String str) {
        try {
            Integer.parseInt(str);
            return 1;
        } catch (NumberFormatException e) {
            return -1;
        } finally {
            System.out.println("test1结束");
            return 0;
        }
    }

}
