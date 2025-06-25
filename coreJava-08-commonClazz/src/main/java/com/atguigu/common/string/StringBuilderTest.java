package com.atguigu.common.string;

import org.junit.Test;

public class StringBuilderTest {

    @Test
    public void test1() {
        StringBuilder builder = new StringBuilder();
        builder.append("abc").append("123").append("def");
        System.out.println(builder);
    }

    @Test
    public void test2() {
        StringBuilder builder = new StringBuilder("hello");
        builder.insert(2, 1);
        builder.insert(2, "abc");
        System.out.println(builder);

        builder.reverse();
        System.out.println(builder);

        System.out.println("builder.length() = " + builder.length());

        builder.setLength(0);
        System.out.println(builder);

        builder.setLength(9);
        System.out.println(builder);
    }

    @Test
    public void test3() {
        statSpendTime(() -> {
            String content = "";
            for (int i = 0; i < 100000; i++) {
                //content += i;
            }
        });

        statSpendTime(() -> {
            StringBuffer content = new StringBuffer();
            for (int i = 0; i < 10000000; i++) {
                content.append(i);
            }
        });

        statSpendTime(() -> {
            StringBuilder content = new StringBuilder();
            for (int i = 0; i < 10000000; i++) {
                content.append(i);
            }
        });
    }

    private static void statSpendTime(Runnable runnable) {
        long start = System.currentTimeMillis();
        runnable.run();
        long end = System.currentTimeMillis();
        System.out.println(end - start + "ms");
    }
}
