package com.baidu.langshiquan.nineth;

/**
 * Created by langshiquan on 17/9/4.
 */

/**
 * 《剑指offer》第四题
 * 实现一个函数，把字符串的每个空格替换成％20
 */
public class Main {
    public static void main(String[] args) {
        String str = "We are happy";
        System.out.println(replace1(str));
        System.out.println(replace2(str));
    }

    /**
     * 使用String的API
     *
     * @param str
     *
     * @return
     */
    public static String replace1(String str) {
        return str.replace(" ", "%20");
    }

    /**
     * 要求：不允许使用String的API
     *
     * @param str
     *
     * @return
     */
    public static String replace2(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ' ') {
                stringBuilder.append(chars[i]);
            } else {
                stringBuilder.append("%20");
            }
        }
        return stringBuilder.toString();
    }

}
