package com.baidu.langshiquan.fourth;

/**
 * Created by Administrator on 2017/8/25.
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * 编写一个能将给定非负整数列表中的数字排列成最大数字的函数。例如，给定[50，2，1,9]，最大数字为95021。
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(9);
        list.add(7);
        list.add(0);
        list.add(36);
        list.add(4);
        System.out.println(max(list));
    }

    public static int max(List<Integer> array) {
        StringBuilder sb = new StringBuilder();
        while (array.size() != 0) {
            // 记录最高位的索引，为了remove
            int maxHighIndex = 0;
            // 记录最高位
            int maxHigh = 0;
            for (int i = 0; i < array.size(); i++) {
                if (getHigh(array.get(i)) >= maxHigh) {
                    maxHighIndex = i;
                    maxHigh = getHigh(array.get(i));
                }
            }
            sb.append(array.get(maxHighIndex));
            array.remove(maxHighIndex);
        }

        return Integer.parseInt(sb.toString());
    }

    // 获取最高位
    public static int getHigh(int number) {
        return Integer.parseInt("" + String.valueOf(number).charAt(0));
    }
}
