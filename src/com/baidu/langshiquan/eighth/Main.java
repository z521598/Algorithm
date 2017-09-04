package com.baidu.langshiquan.eighth;

/**
 * Created by langshiquan on 17/9/4.
 */


/**����ָoffer��������
 * ��һ����ά�����У�ÿһ�ж����մ����ҵ�����˳������ÿһ�ж����մ��ϵ��µ�����˳������
 * ����һ����ά�����һ���������ж��������Ƿ��и�������
 */
public class Main {
    public static void main(String[] args) {
        // ��������
        int[] arr0 = new int[] {1, 2, 8, 9};
        int[] arr1 = new int[] {2, 4, 9, 12};
        int[] arr2 = new int[] {4, 7, 10, 13};
        int[] arr3 = new int[] {6, 8, 11, 15};
        int[][] arrs = new int[][] {arr0, arr1, arr2, arr3};
        int number = 12;
        System.out.println(judge(arrs, number));
    }

    /**
     * ˼·�����Σ������Ͻǿ�ʼ���±Ƚ�
     * @param arrs
     * @param number
     * @return
     */
    public static boolean judge(int[][] arrs, int number) {
        // arrs.length ����������
        // arrs[i].length ������
        int rows = arrs.length;
        int cols = arrs[0].length;
        int i = 0;
        int j = cols - 1;
        while (i < rows && j >= 0) {
            System.out.println(arrs[i][j]);
            if (arrs[i][j] == number) {
                return true;
            } else if (arrs[i][j] > number) {
                j--;
            } else if (arrs[i][j] < number) {
                i++;
            }
        }
        return false;
    }
}
