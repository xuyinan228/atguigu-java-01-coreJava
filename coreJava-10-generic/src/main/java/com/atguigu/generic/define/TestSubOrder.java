package com.atguigu.generic.define;

import org.junit.Test;

import java.util.Date;

public class TestSubOrder {
    @Test
    public void testSubOrder1() {
        SubOrder1 subOrder = new SubOrder1();
        subOrder.setData(new Date());
        System.out.println("subOrder.getData() = " + subOrder.getData());
    }

    @Test
    public void testSubOrder2() {
        SubOrder2<String> subOrder = new SubOrder2();
        subOrder.setData("XYN");
        System.out.println("subOrder.getData() = " + subOrder.getData());
    }

    @Test
    public void testSubOrder3() {
        SubOrder3<String, Integer> subOrder = new SubOrder3();
        subOrder.setData("XYN");
        subOrder.setSubOrderData(18);
        System.out.println("subOrder.getData() = " + subOrder.getData());
        System.out.println("subOrder.getSubOrderData() = " + subOrder.getSubOrderData());
    }
}
