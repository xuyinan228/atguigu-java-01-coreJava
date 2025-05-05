package com.atguigu.array;

public class OneArrayTest {
    public static void main(String[] args) {
        // 静态初始化
        double[] priceArray;
        priceArray = new double[]{
                20.32,
                43.21,
                43.22
        };

        // 动态初始化
        String[] foodArray;
        foodArray = new String[3];
        foodArray[0] = "拌海蜇";
        foodArray[1] = "龙须菜";
        foodArray[2] = "玉兰片";

        for (int i = 0; i < priceArray.length; i++) {
            System.out.print(priceArray[i] + "\t");
        }
        System.out.println();

        for (int i = 0; i < foodArray.length; i++) {
            System.out.print(foodArray[i] + "\t");
        }
        System.out.println();
    }
}
