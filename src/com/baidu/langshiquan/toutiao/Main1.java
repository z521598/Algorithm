package com.baidu.langshiquan.toutiao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by langshiquan on 17/9/10.
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {//注意while处理多个case
            String a = in.next();
            int b = in.nextInt();
            System.out.println(deal(a, b));
        }
    }

    public static int deal(String str, int number) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (map.get(chars[i]) == null) {
                map.put(chars[i], 1);
            } else {
                map.put(chars[i], map.get(chars[i]) + 1);
            }
        }
        System.out.println(map);
        // 遍历map
        Set<Character> sets = map.keySet();
        Iterator<Character> iterator = sets.iterator();
        List<Integer> maxs = new ArrayList<>();
        while (iterator.hasNext()) {
            Character character = iterator.next();
            int times = map.get(character);
            // 获取索引
            List<Integer> indexs = getIndexs(str,character);
            int shengyu = number;
            int max = 1;
            for(int i = 1 ; i < indexs.size() ; i++){
                int juli = indexs.get(i) - indexs.get(i-1) - 1;
                if(juli <= shengyu){
                    shengyu-=juli;
                    max++;
                }
            }
            maxs.add(max);
        }
        System.out.println("maxs:"+maxs);
        return Collections.max(maxs);
    }

    public static List<Integer> getIndexs(String str, Character character){
        List<Integer> list = new ArrayList<>();
        int pos = str.indexOf(character);
        while(pos> -1 ){
            list.add(pos);
            pos = str.indexOf(character,pos+1);

        }
        Collections.sort(list);
        System.out.println("index["+character+"]"+list);
        return list;
    }
}
