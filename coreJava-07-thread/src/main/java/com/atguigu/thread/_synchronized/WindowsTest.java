package com.atguigu.thread._synchronized;

import java.util.Arrays;

public class WindowsTest {
    public static void main(String[] args) {
        Windows windows = new Windows();
        Arrays.asList(
                new Thread(windows, "售票员1"),
                new Thread(windows, "售票员2"),
                new Thread(windows, "售票员3")
        ).forEach(Thread::start);
    }
}
