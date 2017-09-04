package com.baidu.langshiquan.sixth;

/**
 * Created by langshiquan on 17/8/30.
 */

import com.baidu.langshiquan.common.LinkNode;

/**
 * ��μ��һ���������Ƿ�Ϊ��������
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(isRange(LinkNode.getBetaRangeLinkNode()));
        System.out.println(isRange(LinkNode.getBetaLinkNode()));
    }

    /**
     * ˼·������(˫)ָ��
     * ��������Ϊ1��ָ��
     * �죺����Ϊ2��ָ��
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
