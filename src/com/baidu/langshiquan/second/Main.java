package com.baidu.langshiquan.second;

/**
 * Created by Administrator on 2017/8/25.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 编写一个交错合并列表元素的函数。例如：给定的两个列表为[a，B，C]和[1，2，3]，函数返回[a，1，B，2，C，3]。
 */
public class Main {
    public static void main(String[] args) {
        String[] array = new String[]{"a", "B", "C", "D"};
        String[] array2 = new String[]{"1", "2", "3", "4", "5", "6"};
        System.out.println(across(array,array2));
    }

    public static List<String> across(String[] array1, String[] array2) {
//        int[] result = new int[array1.length+array2.length];
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < Math.max(array1.length, array2.length); i++) {
            if (i < array1.length) {
                arrayList.add(array1[i]);
            }
            if (i < array2.length) {
                arrayList.add(array2[i]);
            }
        }
        return arrayList;
    }
}
