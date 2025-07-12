package com.atguigu.generic.define;

public class Order<T> {
    private int orderId;
    private T data;

    public Order() {}

    public Order(int orderId, T data) {
        this.orderId = orderId;
        this.data = data;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
