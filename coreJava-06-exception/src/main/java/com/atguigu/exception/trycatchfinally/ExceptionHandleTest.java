package com.atguigu.exception.trycatchfinally;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandleTest {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            System.out.println(number);

            int number2 = scanner.nextInt();
            System.out.println(number2);

            System.out.println("number / number2 = " + number / number2);
        }catch (InputMismatchException e) {
            System.out.println("出现了InputMismatchException");
            e.printStackTrace();
        }catch (NullPointerException e) {
            System.out.println("出现了NullPointerException");
            e. printStackTrace();
        }catch (RuntimeException e) {
            System.out.println("出现了RuntimeException");
            e.printStackTrace();
        }

        System.out.println("程序正常执行结束");
    }
}
