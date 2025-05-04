package com.atguigu.flowcontrol.loop;

public class ForTest {
    public static void main(String[] args) {
        func1();

        System.out.println();

        func2();

        System.out.println();

        func3();
    }

    private static void func3() {
        int count = 0, sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                count++;
                sum += i;
            }
        }
        System.out.println("count = " + count);
        System.out.println("sum = " + sum);
    }

    private static void func2() {
        int num = 1;
        for(System.out.print("a"); num < 3; System.out.print("c"), num++ ) {
            System.out.print("b");
        }
        System.out.println();
    }

    private static void func1() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Hello World");
        }
    }
}
