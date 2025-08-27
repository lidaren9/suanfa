package com.sufa.x1.sufa_tools.array_utils;

import com.sufa.x1.sufa_tools.base.Node;

import java.util.Stack;

public class PalindromeUtil {

    public static boolean isPalindrome1(Node head) {
        Stack<Node> stack = new Stack<>();
        Node cur = head;
        while (cur != null) {
            stack.push(cur);
            cur = cur.next;
        }

        while (head != null) {
            if (stack.pop().value != head.value) {
                return false;
            }
            head = head.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        node1.next = new Node(2);
        node1.next.next = new Node(3);
        node1.next.next.next = new Node(2);
        node1.next.next.next.next = new Node(1);
        boolean isPalindrome = isPalindrome1(node1);
        if (isPalindrome) {
            System.out.println("这个Node是回文结构");
        } else {
            System.out.println("这个Node不是回文结构");
        }
    }
}
