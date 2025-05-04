package com.atguigu.flowcontrol.loop;

import java.util.Scanner;

public class DoWhileTest {
    public static void main(String[] args) {
        System.out.print("输入两个不同的数字：");
        Scanner console = new Scanner(System.in);

        int num1 = console.nextInt();
        int num2 = console.nextInt();

        int min = Math.min(num1, num2);
        int max = Math.max(num1, num2);

        int i = 2;
        int res = 1;
        do {
            if( num1 % i == 0 && num2 % i == 0 ){
                res = i;
            }
            i++;
        }while (i <= min);
        System.out.println(num1 + "和" + num2 + "的最大公约数是" + res);

        i = max;
        do {
            if( i % num1 == 0 && i % num2 == 0 ){
                res = i;
                break;
            }
            i++;
        }while (true);

        System.out.println(num1 + "和" + num2 + "的最小公倍数是" + res);
    }
}
