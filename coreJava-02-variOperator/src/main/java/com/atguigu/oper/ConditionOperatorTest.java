package com.atguigu.oper;

public class ConditionOperatorTest {
    public static void main(String[] args) {
        String res = (2 > 1) ? "表达式1" : "表达式2";
        System.out.println("res = " + res);

        double dres = 2 > 1 ? 1 : 2.0;
        System.out.println("dres = " + dres);

        System.out.println(max(1, 2, 3));
    }

    public static int max(int i, int j, int k) {
        return max(max(i, j), k);
    }

    public static int max(int i, int j) {
        return i > j ? i : j;
    }
}
