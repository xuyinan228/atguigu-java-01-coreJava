package com.atguigu.thread.communication;

import com.atguigu.thread.utils.ThreadUtils;

public class Printer implements Runnable {

    private int count = 1;

    @Override
    public void run() {
        while (true){
            synchronized (this) {
                ThreadUtils.notify(this);
                if (count <= 100) {
                    System.out.println(Thread.currentThread().getName() + ":" + (count++) );
                    ThreadUtils.wait(this);
                } else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Printer printer = new Printer();

        Thread t1 = new Thread(printer, "线程1");
        Thread t2 = new Thread(printer, "线程2");

        t1.start();
        t2.start();
    }
}
