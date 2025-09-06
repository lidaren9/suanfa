package com.sufa.x1.sufa_tools.node_utils;

import com.sufa.x1.sufa_tools.base.Node;

import java.util.HashMap;

public class CopyListWithRandom {
    public static void main(String[] args) {
        Node  n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        n1.rand = n3;
        n2.rand = n3;
        n3.rand = n2;
        n1.next = n2;
        n2.next = n3;
        Node node = copyListWithRand1(n1);
        System.out.println(node);
    }

    public static Node copyListWithRand1(Node head) {
        HashMap<Node, Node> map = new HashMap<>();
        Node cur = head;
        while (cur != null) {
            map.put(cur, new Node(cur.value));
            cur = cur.next;
        }
        cur = head;
        while (cur != null) {
            map.get(cur).next = map.get(cur.next);
            map.get(cur).rand = map.get(cur.rand);
            cur = cur.next;
        }
        return map.get(head);
    }
}
