package com.atguigu.array;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr3 = {1, 2, 3, 5, 4};

        System.out.println("Arrays.toString(arr1) = " + Arrays.toString(arr1));
        System.out.println("Arrays.toString(arr2) = " + Arrays.toString(arr2));
        System.out.println("Arrays.toString(arr3) = " + Arrays.toString(arr3));

        System.out.println( );

        System.out.println("arr1 == arr2 = " + (arr1 == arr2));
        System.out.println("Arrays.equals(arr1, arr2) = " + Arrays.equals(arr1, arr2));
        System.out.println("Arrays.equals(arr1, arr3) = " + Arrays.equals(arr1, arr3));

        System.out.println();

        Arrays.fill(arr3, 10);
        System.out.println("Arrays.toString(arr3) = " + Arrays.toString(arr3));

        System.out.println();

        int[] arr4 = new int[10];
        for(int i = 0 ; i < arr4.length ; i++){
            arr4[i] = (int) (Math.random() * 100);
        }
        System.out.println("Arrays.toString(arr4) = " + Arrays.toString(arr4));
        Arrays.sort(arr4);
        System.out.println("Arrays.toString(arr4) = " + Arrays.toString(arr4));
    }
}
