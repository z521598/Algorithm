package com.baidu.langshiquan.third;

/**
 * Created by Administrator on 2017/8/25.
 */

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * 编写一个计算前100位斐波那契数的函数。根据定义，
 * 斐波那契序列的前两位数字是0和1，随后的每个数字是前两个数字的和。例如，前10位斐波那契数为：0，1，1，2，3，5，8，13，21，34。
 */
public class Main {
    // BigInteger
    public static void main(String[] args) {
        BigInteger first = new BigInteger("0");
        BigInteger second = new BigInteger("1");;
        List<BigInteger> arrayList = new ArrayList<>();
        arrayList.add(first);
        for (int i = 0; i < 99; i++) {
            arrayList.add(second);
            BigInteger temp = first.add(second);
            first = second;
            second = temp;
        }
        System.out.println(arrayList.size());
        System.out.println(arrayList);
    }
}
