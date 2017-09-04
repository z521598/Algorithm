package com.baidu.langshiquan.eighth;

/**
 * Created by langshiquan on 17/9/4.
 */


/**《剑指offer》第三题
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 输入一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class Main {
    public static void main(String[] args) {
        // 测试用例
        int[] arr0 = new int[] {1, 2, 8, 9};
        int[] arr1 = new int[] {2, 4, 9, 12};
        int[] arr2 = new int[] {4, 7, 10, 13};
        int[] arr3 = new int[] {6, 8, 11, 15};
        int[][] arrs = new int[][] {arr0, arr1, arr2, arr3};
        int number = 12;
        System.out.println(judge(arrs, number));
    }

    /**
     * 思路：矩形，从右上角开始向下比较
     * @param arrs
     * @param number
     * @return
     */
    public static boolean judge(int[][] arrs, int number) {
        // arrs.length 层数，行数
        // arrs[i].length 列数，
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
