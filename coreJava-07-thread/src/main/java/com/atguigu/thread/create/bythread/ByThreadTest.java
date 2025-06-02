package com.atguigu.thread.create.bythread;

public class ByThreadTest {
    public static void main(String[] args) {
        PrintNumberThread evenNumberThread = new PrintNumberThread(true);
        evenNumberThread.start();

        PrintNumberThread oddNumberThread = new PrintNumberThread(false);
        oddNumberThread.start();
    }
}
