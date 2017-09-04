package com.baidu.langshiquan.tenth;

/**
 * Created by langshiquan on 17/9/4.
 */

import java.util.LinkedList;

import com.baidu.langshiquan.common.LinkNode;

/**
 * 《剑指offer》第五题
 * 输入一个链表的头结点，从尾到头反过来打印每个结点的值
 */
public class Main {
    public static void main(String[] args) {
        // in : 1->5->9->19->2->40->3->7
        print(LinkNode.getBetaLinkNode());
    }

    /**
     *
     * @param head
     */
    public static void print(LinkNode head) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        while (head != null){
            linkedList.add(head.getData());
            head = head.getNextNode();
        }
        while (!linkedList.isEmpty()){
            System.out.println(linkedList.removeLast());
        }
    }
}
