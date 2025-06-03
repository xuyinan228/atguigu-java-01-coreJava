package com.atguigu.thread._synchronized;

import com.atguigu.thread.utils.ThreadUtils;

public class Windows implements Runnable {
    private int count = 100;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (count > 0) {
                    ThreadUtils.sleep(10);
                    System.out.println(Thread.currentThread().getName() + " - " + (count--));
                } else {
                    break;
                }
            }
        }
    }
}
