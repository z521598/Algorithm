package com.baidu.langshiquan.pack01;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by langshiquan on 17/9/14.
 */
public class Main {
    public static LinkedList<Integer> list = new LinkedList<>();

    public static Boolean resFlag = false;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] arrs = new int[n];
        for (int i = 0; i < n; i++) {
            arrs[i] = scan.nextInt();
        }
        int i = 0;
        Boolean flag = false;
        sumOfkNum(k, arrs, n, i, flag);
        if(!resFlag){
            System.out.println("NO");
        }
    }

    public static void sumOfkNum(int sum, int[] arrs, int n, int i, Boolean flag) {
        if (sum <= 0 || i == n || flag) {
            return;
        }
        if (sum == arrs[i]) {
            System.out.println("YES");
            for (int num : list) {
                System.out.print(num + " ");
            }
            System.out.print(arrs[i]);
            flag = true;
            resFlag = true;
        }

        list.push(arrs[i]);
        sumOfkNum(sum - arrs[i], arrs, n, i + 1, flag);
        list.pop();
        sumOfkNum(sum, arrs, n, i + 1, flag);
    }
}

