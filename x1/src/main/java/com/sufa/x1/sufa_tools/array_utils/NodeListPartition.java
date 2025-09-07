package com.sufa.x1.sufa_tools.array_utils;

import com.sufa.x1.sufa_tools.base.Node;

public class NodeListPartition {
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
