package com.baidu.langshiquan.fifth;

/**
 * Created by Administrator on 2017/8/25.
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * 编写一个在1，2，…，9（顺序不能变）数字之间插入+或-或什么都不插入，使得计算结果总是100的程序，
 * 并输出所有的可能性。例如：1 + 2 + 34 – 5 + 67 – 8 + 9 = 100。
 */
public class Main {
    public static List<String> symbol = new ArrayList<>();

    static {
        symbol.add("");
        symbol.add("+");
        symbol.add("-");
    }

    public static void main(String[] args) {
        method1();
    }

    public static List<String> method1() {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine scriptEngine = manager.getEngineByName("js");
        List<String> list = new ArrayList<>();
        // TODO 枚举
        Iterator<String> iterable = list.iterator();
        while (iterable.hasNext()) {
            try {
                String str = iterable.next();
                System.out.println(str);
                if ((Integer) scriptEngine.eval(str) != 100) {
                    iterable.remove();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return list;
    }
}
