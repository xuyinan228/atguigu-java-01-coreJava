package com.atguigu.common.math;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random random = new Random();
        // 随机生成一个任意的int
        System.out.println("random.nextInt() = " + random.nextInt());

        // 随机一个整数，范围为 [0, 10)
        System.out.println("random.nextInt(10) = " + random.nextInt(10));
    }
}
