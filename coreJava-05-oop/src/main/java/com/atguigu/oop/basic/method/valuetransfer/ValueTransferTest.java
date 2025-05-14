package com.atguigu.oop.basic.method.valuetransfer;

public class ValueTransferTest {
    public static void main(String[] args) {
        int i = 10, j = 20;
        System.out.println("before invoke swap. i = " + i + ", j = " + j);
        swap(i, j);
        System.out.println("after invoke swap. i = " + i + ", j = " + j);


        System.out.println();

        Order o1 = new Order();
        Order o2 = new Order();
        o1.val = 10;
        o2.val = 20;
        System.out.println("before invoke swap. o1.val = " + o1.val + ", o2.val = " + o2.val);
        swap(o1, o2);
        System.out.println("after invoke swap. o1.val = " + o1.val + ", o2.val = " + o2.val);
    }

    public static void swap(Order o1, Order o2) {
        o1.val ^= o2.val;
        o2.val ^= o1.val;
        o1.val ^= o2.val;
    }

    public static void swap(int i, int j) {
        i ^= j;
        j ^= i;
        i ^= j;
        System.out.println("after swap. i = " + i + ", j = " + j);
    }
}

class Order {
    int val;
}
