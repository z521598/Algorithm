package com.baidu.langshiquan.seventh;

/**
 * Created by langshiquan on 17/8/30.
 */

/**
 * 已知一个整数n,将其转化为二进制，并求得其有二进制字符串有多少个1。
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(sum1(122));
        System.out.println(sum1(-122));
        System.out.println(sum2(122));
        System.out.println(sum2(-122));
        System.out.println(sum3(122));
        System.out.println(sum3(-122));
    }

    /**
     * 思路：先求二进制，转为为String，求数量
     *
     * @param n
     *
     * @return
     */
    public static int sum1(int n) {
        Integer i = new Integer(n);
        // Integr的API
        String bi = Integer.toBinaryString(i);
        System.out.println("debug: " + bi);
        int sum = 0;
        char[] chars = bi.toCharArray();
        for (int j = 0; j < chars.length; j++) {
            if (chars[j] == '1') {
                sum++;
            }
        }
        return sum;
    }

    // TODO 求二进制
    // 正数
    // 负数
    public static String toBinaryString(int n) {
        StringBuilder sb = new StringBuilder();

        return sb.toString();
    }

    /**
     * 思路：位运算
     *
     * @param n
     *
     * @return
     */
    public static int sum2(int n) {
        // TODO 位运算
        return 0;
    }

    /**
     * Integer的API
     *
     * @param n
     *
     * @return
     */
    public static int sum3(int n) {
        return Integer.bitCount(n);
    }
}
