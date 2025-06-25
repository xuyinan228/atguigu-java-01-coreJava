package com.atguigu.common.system;

public class RuntimeTest {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("CPU核数：" + runtime.availableProcessors());

        String str = "";
        for (int i = 0; i < 10000; i++) {
            str = str + i;
        }
        long initialMemory = runtime.totalMemory();
        long maxMemory = runtime.maxMemory();
        long freeMemory = runtime.freeMemory();

        System.out.println("最大可用内存：" + (maxMemory / 1024 / 1024) + "MB");
        System.out.println("总内存：" + (initialMemory / 1024 / 1024) + "MB");
        System.out.println("空闲内存：" + (freeMemory / 1024 / 1024) + "MB");
        System.out.println("已用内存" + ((initialMemory - freeMemory) / 1024 / 1024) + "MB");

    }
}
