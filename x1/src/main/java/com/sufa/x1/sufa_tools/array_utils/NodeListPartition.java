package com.sufa.x1.sufa_tools.array_utils;

import com.sufa.x1.sufa_tools.base.Node;

public class NodeListPartition {
    public static void main(String[] args) {
        Node test = new Node(4);
        Node test1 = new Node(6);
        Node test2 = new Node(3);
        Node test3 = new Node(5);
        Node test4 = new Node(8);
        Node test5 = new Node(5);
        Node test6 = new Node(2);
        Node test7 = new Node(5);
        Node test8 = new Node(9);
        test.next = test1;
        test1.next = test2;
        test2.next = test3;
        test3.next = test4;
        test4.next = test5;
        test5.next = test6;
        test6.next = test7;
        test7.next = test8;
        Node node = listPartition(test, 5);
        System.out.println(node);
    }

    public static Node listPartition(Node head, int k) {
        Node sHead = null;
        Node sTail = null;
        Node eHead = null;
        Node eTail = null;
        Node mHead = null;
        Node mTail = null;
        Node next = null;
        while (head != null) {
            next = head.next;
            if (head.value < k) {
                if (sHead == null) {
                    sHead = head;
                    sTail = head;
                } else  {
                    sTail.next = head;
                    sTail = head;
                }
            } else if (head.value == k) {
                if (eHead == null) {
                    eHead = head;
                    eTail = head;
                } else   {
                    eTail.next = head;
                    eTail = head;
                }
            } else if (head.value > k) {
                if (mHead == null) {
                    mHead = head;
                    mTail = head;
                } else   {
                    mTail.next = head;
                    mTail = head;
                }
            }
            head = next;
        }
        if (sHead != null) {
            sTail.next = eHead;
            eTail = eTail == null ? sTail : eTail;
        }
        if (eTail != null) {
            eTail.next = mHead;
        }
        return sHead != null ? sHead : (eHead != null ? eHead : mHead);
    }
}
