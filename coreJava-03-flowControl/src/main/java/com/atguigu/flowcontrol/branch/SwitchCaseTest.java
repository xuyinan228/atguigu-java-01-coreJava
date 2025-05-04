package com.atguigu.flowcontrol.branch;

import java.util.Scanner;

public class SwitchCaseTest {
    public static void main(String[] args) {
        func1();

        System.out.println();

        func2();

        System.out.println();

        func3();
    }

    private static void func3() {
        Scanner console = new Scanner(System.in);
        System.out.print("输入月份与日：");
        int month = console.nextInt();
        int day = console.nextInt();
        int res = 0;
        switch (month) {
            case 12:
                res += 30;
            case 11:
                res += 31;
            case 10:
                res += 30;
            case 9:
                res += 31;
            case 8:
                res += 31;
            case 7:
                res += 30;
            case 6:
                res += 31;
            case 5:
                res += 30;
            case 4:
                res += 31;
            case 3:
                res += 28;
            case 2:
                res += 31;
        }
        res += day;
        System.out.println(month + "月" + day + "日是当年的第" + res + "天");
    }

    private static void func2() {
        Scanner console = new Scanner(System.in);
        System.out.print("输入学生成绩：");
        int score = console.nextInt();
        switch (score/10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("不合格");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("合格");
                break;
            default:
                System.out.println("分数异常");
        }
    }

    private static void func1() {
        int num = 1;
        switch (num) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("other");
                break;
        }
    }
}
