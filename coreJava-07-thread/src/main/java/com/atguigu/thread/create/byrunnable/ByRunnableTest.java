package com.atguigu.thread.create.byrunnable;

public class ByRunnableTest {
    public static void main(String[] args) {
        PrintNumberRunnable evenRunnable = new PrintNumberRunnable(true);
        PrintNumberRunnable oddRunnable = new PrintNumberRunnable(false);

        new Thread(evenRunnable).start();
        new Thread(oddRunnable).start();
    }
}
