package com.baidu.langshiquan.seventh;

/**
 * Created by langshiquan on 17/8/30.
 */

/**
 * ��֪һ������n,����ת��Ϊ�����ƣ���������ж������ַ����ж��ٸ�1��
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
     * ˼·����������ƣ�תΪΪString��������
     *
     * @param n
     *
     * @return
     */
    public static int sum1(int n) {
        Integer i = new Integer(n);
        // Integr��API
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

    // TODO �������
    // ����
    // ����
    public static String toBinaryString(int n) {
        StringBuilder sb = new StringBuilder();

        return sb.toString();
    }

    /**
     * ˼·��λ����
     *
     * @param n
     *
     * @return
     */
    public static int sum2(int n) {
        // TODO λ����
        return 0;
    }

    /**
     * Integer��API
     *
     * @param n
     *
     * @return
     */
    public static int sum3(int n) {
        return Integer.bitCount(n);
    }
}
