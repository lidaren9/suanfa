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

    public static boolean isPalindrome2(Node head) {
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        Stack<Node> stack = new Stack<>();
        while (slow != null) {
            stack.push(slow);
            slow = slow.next;
        }
        while (!stack.empty()) {
            if (stack.pop().value != head.value) {
                return false;
            }
            head = head.next;
        }
        return true;
    }

    public static boolean isPalindrome3(Node head) {
        if (head == null || head.next == null) {
            return true;
        }
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        fast = slow.next;
        slow.next = null;
        Node temp = null;
        while (fast != null) {
            temp = fast.next;
            fast.next = slow;
            slow = fast;
            fast = temp;
        }
        temp = slow;
        fast = head;
        boolean res = true;
        while (slow != null && fast != null) {
            if (slow.value != fast.value) {
                res = false;
                break;
            }
            fast = fast.next;
            slow = slow.next;
        }
        slow = temp.next;
        temp.next = null;
        while (slow != null) {
            fast = slow.next;
            slow.next = temp;
            temp = slow;
            slow = fast;
        }
        return res;
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        node1.next = new Node(2);
        node1.next.next = new Node(3);
        node1.next.next.next = new Node(2);
        node1.next.next.next.next = new Node(1);
        boolean isPalindrome1 = isPalindrome1(node1);
        if (isPalindrome1) {
            System.out.println("这个Node是回文结构");
        } else {
            System.out.println("这个Node不是回文结构");
        }
        boolean isPalindrome2 = isPalindrome2(node1);
        if (isPalindrome2) {
            System.out.println("这个Node是回文结构");
        } else {
            System.out.println("这个Node不是回文结构");
        }
        boolean isPalindrome3 = isPalindrome3(node1);
        if (isPalindrome3) {
            System.out.println("这个Node是回文结构");
        } else {
            System.out.println("这个Node不是回文结构");
        }
    }
}
