package com.baidu.langshiquan.common;

/**
 * Created by langshiquan on 17/9/4.
 */
public class LinkNode {
    private int data;
    private LinkNode nextNode;

    public LinkNode(int data, LinkNode nextNode) {
        this.data = data;
        this.nextNode = nextNode;
    }

    public LinkNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public LinkNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(LinkNode nextNode) {
        this.nextNode = nextNode;
    }

    /**
     *
     * @return 1->5->9->19->2->40->3->7
     */
    public static LinkNode getBetaLinkNode() {
        LinkNode root = new LinkNode(1);
        LinkNode node1 = new LinkNode(5);
        LinkNode node2 = new LinkNode(9);
        LinkNode node3 = new LinkNode(19);
        LinkNode node4 = new LinkNode(2);
        LinkNode node5 = new LinkNode(40);
        LinkNode node6 = new LinkNode(3);
        LinkNode node7 = new LinkNode(7);
        root.setNextNode(node1);
        node1.setNextNode(node2);
        node2.setNextNode(node3);
        node3.setNextNode(node4);
        node4.setNextNode(node5);
        node5.setNextNode(node6);
        node6.setNextNode(node7);
        return root;
    }

    /**
     *
     * @return 1->5->9->19->2->40->3->7
     */
    public static LinkNode getBetaRangeLinkNode() {
        LinkNode root = new LinkNode(1);
        LinkNode node1 = new LinkNode(5);
        LinkNode node2 = new LinkNode(9);
        LinkNode node3 = new LinkNode(19);
        LinkNode node4 = new LinkNode(2);
        LinkNode node5 = new LinkNode(40);
        LinkNode node6 = new LinkNode(3);
        LinkNode node7 = new LinkNode(7);
        root.setNextNode(node1);
        node1.setNextNode(node2);
        node2.setNextNode(node3);
        node3.setNextNode(node4);
        node4.setNextNode(node5);
        node5.setNextNode(node6);
        node6.setNextNode(node7);
        // »·Á´±í
        node7.setNextNode(root);
        return root;
    }


}
