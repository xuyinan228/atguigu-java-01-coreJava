package com.atguigu.thread.utils;

import java.util.Random;

public class RandomUtils {

    public static int random(int min, int max) {
        Random random = new Random();
        return random.nextInt(max) % (max - min + 1) + min;
    }
}
