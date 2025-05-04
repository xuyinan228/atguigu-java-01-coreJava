package com.atguigu.flowcontrol.branch;

import java.util.Scanner;

public class IfTest {
    public static void main(String[] args) {
         func1();

        System.out.println();

        func2();

        System.out.println();

        func3();

        System.out.println();

        func4();
    }

    private static void func4() {
        Scanner console = new Scanner(System.in);
        System.out.print("输入三个整数：");
        int num1 = console.nextInt();
        int num2 = console.nextInt();
        int num3 = console.nextInt();
        if( num1 > num2 ) {
            if( num2 > num3 ) {
                System.out.println(num3 + ", " + num2 + ", " + num1);
            } else if( num1 > num3){
                System.out.println(num2 + ", " + num3 + ", " + num1);
            } else {
                System.out.println(num2 + ", " + num1 + ", " + num3);
            }
        } else {
            if( num1 > num3 ) {
                System.out.println(num3 + ", " + num1 + ", " + num2);
            } else if( num2 > num3){
                System.out.println(num1 + ", " + num3 + ", " + num2);
            } else {
                System.out.println(num1 + ", " + num2 + ", " + num3);
            }
        }
        console.close();
    }

    private static void func3() {
        int score = 99;
        if( score == 100 ) {
            System.out.println("奖励一辆跑车");
        } else if( score > 80 ) {
            System.out.println("奖励一辆山地自行车");
        } else if( score >= 60 ) {
            System.out.println("奖励环球影城一日游");
        } else {
            System.out.println("胖揍一顿");
        }
    }

    private static void func2() {
        int num = 13;
        if( num % 2 == 0 ) {
            System.out.println("这是偶数");
        } else {
            System.out.println("这是奇数");
        }
    }

    private static void func1() {
        int heartBeat = 59;
        if( heartBeat < 60 || heartBeat > 100) {
            System.out.println("你需要做进一步的检查");
        }
        System.out.println("体检结束");
    }
}
