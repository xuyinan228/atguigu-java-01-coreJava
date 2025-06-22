package com.atguigu.thread.create.bycallable;

import com.atguigu.thread.utils.ThreadUtils;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class NumberThread implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for(int i = 0 ; i < 100 ; i++){
            if(i % 2 == 0){
                sum += i;
                ThreadUtils.sleep(10);
            }
        }
        return sum;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        NumberThread numberThread = new NumberThread();
        FutureTask<Integer> futureTask = new FutureTask<>(numberThread);
        new Thread(futureTask).start();
        System.out.println("futureTask.get() = " + futureTask.get());
    }
}
