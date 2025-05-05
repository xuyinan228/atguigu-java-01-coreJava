package com.atguigu.array;

import java.util.Scanner;

public class OneArrayExer {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("请输入学生人数：");
        int count = console.nextInt();

        int max = 0;
        int[] scores = new int[count];
        System.out.print("请输入" + count + "个学生的成绩：");
        for (int i = 0; i < count; i++) {
            scores[i] = console.nextInt();
            max = Math.max(max, scores[i]);
        }

        System.out.println("最高分是：" + max);

        for (int i = 0; i < scores.length; i++) {
            System.out.println("student " + (i + 1) + " 的成绩是 " + scores[i]);
        }
    }
}
