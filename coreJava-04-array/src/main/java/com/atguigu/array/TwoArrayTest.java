package com.atguigu.array;

import java.util.function.BiFunction;

public class TwoArrayTest {
    public static void main(String[] args) {
        func1();

        System.out.println();

        func2();
    }

    private static void func2() {
        int[][] yanghui = new int[10][];
        yanghui[0] = new int[]{1};
        for(int i = 1 ; i < yanghui.length ; i++) {
            yanghui[i] = new int[i+1];
            for(int j = 0 ; j <= i ; j++){
                int num1 = j < 0 || j > i - 1 ? 0 : yanghui[i-1][j];
                int num2 = j - 1 < 0 || j - 1 > i - 1 ? 0 : yanghui[i-1][j-1];
                yanghui[i][j] = num1 + num2;
            }
        }
        for(int i = 0 ; i < yanghui.length ; i++) {
            for(int j = 0 ; j < yanghui[i].length ; j++) {
                System.out.print(yanghui[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static void func1() {
        int[][] arr = new int[][]{
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
