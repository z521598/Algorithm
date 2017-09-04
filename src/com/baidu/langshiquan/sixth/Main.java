package com.baidu.langshiquan.sixth;

/**
 * Created by langshiquan on 17/8/30.
 */

import com.baidu.langshiquan.common.LinkNode;

/**
 * 如何检查一个单链表是否为环形链表
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(isRange(LinkNode.getBetaRangeLinkNode()));
        System.out.println(isRange(LinkNode.getBetaLinkNode()));
    }

    /**
     * 思路：快慢(双)指针
     * 慢：步长为1的指针
     * 快：步长为2的指针
     * @param root
     * @return
     */
    public static boolean isRange(LinkNode root) {
        LinkNode low = root.getNextNode();
        LinkNode fast = root.getNextNode().getNextNode();
        while (low != null) {
            if (low == fast) {
                return true;
            }
            low = low.getNextNode();
            if (fast != null && fast.getNextNode() != null) {
                fast = fast.getNextNode().getNextNode();
            }
        }
        return false;
    }
}
