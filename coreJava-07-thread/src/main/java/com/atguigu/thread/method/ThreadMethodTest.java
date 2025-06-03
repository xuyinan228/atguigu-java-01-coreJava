package com.atguigu.thread.method;

public class ThreadMethodTest {
    public static void main(String[] args) throws InterruptedException {
        PrintNumberRunnable evenRunnable = new PrintNumberRunnable(true);
        Thread evenThread = new Thread(evenRunnable, "EVEN_THREAD");
        evenThread.start();

        Thread.currentThread().setName("主线程");
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 1) {
                System.out.println(Thread.currentThread().getName() + " - " + i);
            }
            if( i == 20 ) {
                Thread.yield();
            }
            if( i == 40 ) {
                System.out.println("evenThread.isAlive() = " + evenThread.isAlive());
            }
            if( i == 50 ) {
                evenThread.join();
            }
        }
    }
}
