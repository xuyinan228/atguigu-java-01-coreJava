package com.atguigu.thread.deadlock;

import com.atguigu.thread.utils.ThreadUtils;

public class DeadLockTest {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();

        new Thread(() -> {
            synchronized (o1) {
                ThreadUtils.sleep(500);
                synchronized (o2) {
                    System.out.println(Thread.currentThread().getName() + " finish ");
                }
            }
        }).start();

        new Thread(() -> {
            synchronized (o2) {
                ThreadUtils.sleep(500);
                synchronized (o1) {
                    System.out.println(Thread.currentThread().getName() + " finish ");
                }
            }
        }).start();
    }
}
