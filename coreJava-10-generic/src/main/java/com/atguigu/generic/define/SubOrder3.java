package com.atguigu.generic.define;

public class SubOrder3<OT, SOT> extends Order<OT> {
    private SOT subOrderData;

    public SOT getSubOrderData() {
        return subOrderData;
    }

    public void setSubOrderData(SOT subOrderData) {
        this.subOrderData = subOrderData;
    }
}
