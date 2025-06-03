package com.atguigu.thread.method;

public class PrintNumberRunnable implements Runnable {
    private boolean even;

    public PrintNumberRunnable(boolean even) {
        this.even = even;
    }

    @Override
    public void run() {
        int target = even ? 0 : 1;
        for (int i = 1; i < 100; i++) {
            if (i % 2 == target) {
                System.out.println(Thread.currentThread().getName() + " - " + i);
            }
        }
    }
}
