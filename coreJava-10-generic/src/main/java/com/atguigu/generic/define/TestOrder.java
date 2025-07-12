package com.atguigu.generic.define;

import org.junit.Test;

public class TestOrder {
    @Test
    public void test1() {
        Order<Integer> order = new Order<>();
        order.setData(18);
        Integer data = order.getData();
        System.out.println("data = " + data);
    }

    @Test
    public void test2() {
        Order<String> order = new Order<>();
        order.setData("XYN");
        String data = order.getData();
        System.out.println("data = " + data);
    }
}
