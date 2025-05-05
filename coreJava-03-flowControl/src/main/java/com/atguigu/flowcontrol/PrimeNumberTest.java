package com.atguigu.flowcontrol;

public class PrimeNumberTest {
    public static void main(String[] args) {
        statTime(PrimeNumberTest::findPrimeNumber);
    }

    private static void findPrimeNumber() {
        boolean isPrime;
        int count = 0;
        for(int i = 2 ; i <= 100000; i++ ) {
            isPrime = true;
            for(int j = 2 ; j <= Math.sqrt(i); j++ ) {
                if( i % j == 0 ) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                count++;
                //System.out.println(i);
            }
        }
        System.out.println("count = " + count);
    }

    private static void statTime(Runnable runnable) {
        long start = System.currentTimeMillis();
        runnable.run();
        long end = System.currentTimeMillis();
        System.out.println("spend " + (end - start) + " ms");
    }
}
