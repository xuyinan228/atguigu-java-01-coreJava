package com.atguigu.thread.utils;


public class ThreadUtils {
    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void wait(Object object) {
        try {
            object.wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void notify(Object object) {
        object.notify();
    }

    public static void notifyAll(Object object) {
        object.notifyAll();
    }
}
