package com.atguigu.flowcontrol.loop;

import java.util.Scanner;

public class InfiniteLoopTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num;
        int positiveCount = 0, negativeCount = 0;
        while (true){
            num = console.nextInt();
            if( num == 0 ){
                break;
            } else if(num < 0){
                negativeCount++;
            } else {
                positiveCount++;
            }
        }
        System.out.println("positiveCount = " + positiveCount);
        System.out.println("negativeCount = " + negativeCount);
    }
}
