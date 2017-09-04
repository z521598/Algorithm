package com.baidu.langshiquan.tenth;

/**
 * Created by langshiquan on 17/9/4.
 */

import java.util.LinkedList;

import com.baidu.langshiquan.common.LinkNode;

/**
 * ����ָoffer��������
 * ����һ�������ͷ��㣬��β��ͷ��������ӡÿ������ֵ
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
