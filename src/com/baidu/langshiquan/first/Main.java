package com.baidu.langshiquan.first;

/**
 * Created by Administrator on 2017/8/25.
 */

/**
 * 使用for循环、while循环和递归写出3个函数来计算给定数列的总和。
 */
public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{4, 6, 2, 3, 64, 23, 54, 234, 12};
        //1. for
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);
        //2. while
        int sum2 = 0;
        int index = 0;
        while (index < array.length) {
            sum2 = sum2 + array[index];
            index++;
        }
        System.out.println(sum2);

        System.out.println(add(array, 0));
    }

    //3. 递归
    public static int add(int[] array, int j) {
        if (j < array.length) {
            // ++j 不是 j++
            return array[j] + add(array, ++j);
        } else {
            return 0;
        }
    }
}
