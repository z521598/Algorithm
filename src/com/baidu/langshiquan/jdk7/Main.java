package com.baidu.langshiquan.jdk7;

import java.io.Console;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import oracle.jvm.hotspot.jfr.ThreadStates;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        int i = 0b00010101011110101;
        System.out.println(i);
        Console console = System.console();
        Console cons = System.console();
        if (cons != null) {
            // -------------------------
            PrintWriter printWriter = cons.writer();
            printWriter.write("input:");
            cons.flush();
            // -------------------------
            String str1 = cons.readLine();
            // -------------------------
            cons.format("%s", str1);
        }

        String path = "/Users/langshiquan/temp";
        String something = "asd";
    }
    Main(){
        Integer i = 10;
        Integer i1 = Integer.valueOf(10);
        Integer i2 = i.intValue();

        Integer l = 1;
        Integer l2 = Integer.valueOf(1);
        Integer l3 = new Integer(1);

        System.out.println(i);
        System.out.println(i.intValue());
    }
}

