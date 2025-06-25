package com.atguigu.common.math;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal("12345.351");
        BigDecimal bd2 = new BigDecimal("11");

        System.out.println("bd1.divide(bd2, RoundingMode.HALF_UP) = " + bd1.divide(bd2, RoundingMode.HALF_UP));
        System.out.println("bd1.divide(bd2, 15, RoundingMode.HALF_UP) = " + bd1.divide(bd2, 15, RoundingMode.HALF_UP));
    }
}
