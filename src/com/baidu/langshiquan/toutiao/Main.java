package com.baidu.langshiquan.toutiao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by langshiquan on 17/9/10.
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int c = sc.nextInt();

            Map<Integer, List<Integer>> colorIndexMap = new HashMap<>();
            for (int i = 0; i < n; i++) {
                // 接下来输入的个数
                int sum = sc.nextInt();
                for (int j = 0; j < sum; j++) {
                    int color = sc.nextInt();
                    if (colorIndexMap.get(color) == null) {
                        List<Integer> list = new ArrayList<>();
                        list.add(i);
                        colorIndexMap.put(color, list);
                    } else {
                        colorIndexMap.get(color).add(i);
                    }
                }
            }
            System.out.println(deal(colorIndexMap, n,m, c));
        }
    }

    public static int deal(Map<Integer, List<Integer>> colorIndexMap, int number,int fanwei, int colorSum) {
        int res = 0;
        Set<Integer> sets = colorIndexMap.keySet();
        Iterator<Integer> iterator = sets.iterator();
        while (iterator.hasNext()) {
            Integer colorId = iterator.next();
            List<Integer> list = colorIndexMap.get(colorId);
            // 一种颜色的情况
            if(list.size() == 1){
                continue;
            }
            for (int i = 1; i < list.size(); i++) {
                // 情况1
                if(list.get(i) - list.get(i-1) <= fanwei){
                    res++;
                    break;
                }
                // 情况2,结尾处
                if(i == list.size() - 1) {
                    int jiewei = list.size();
                    if(number - jiewei + list.get(0) <= fanwei){
                        res++;
                        break;
                    }

                }

            }
        }
        return res;
    }
}
