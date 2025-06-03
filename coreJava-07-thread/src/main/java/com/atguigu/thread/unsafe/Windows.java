package com.atguigu.thread.unsafe;

import com.atguigu.thread.utils.ThreadUtils;

public class Windows implements Runnable {
    private int count = 100;

    @Override
    public void run() {
        while (count > 0) {
            ThreadUtils.sleep(10);
            System.out.println(Thread.currentThread().getName() + " - " + (count--));
        }
    }
}
