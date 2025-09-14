package com.sufa.x1.sufa_tools.node_utils;

import com.sufa.x1.sufa_tools.base.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TreeCheckUtil {


    public static int preValue = Integer.MIN_VALUE;
    public static boolean checkBst(Node node){
        if(node==null){
            return true;
        }
        boolean isLeftBst = checkBst(node.left);
        if (!isLeftBst) {
            return false;
        }
        if (node.value <= preValue){
            return false;
        } else {
            preValue = node.value;
        }
        return checkBst(node.right);
    }

    public static boolean checkBst1(Node node){
        List<Node> inOrderList = new ArrayList<>();
        process1(node, inOrderList);
        for (Node n : inOrderList) {
            System.out.print(n.value);
        }
        System.out.println();
        for (int i = 1; i < inOrderList.size(); i++) {
            return inOrderList.get(i - 1).value < inOrderList.get(i).value;
        }
        return false;
    }

    private static void process1(Node head, List<Node> inOrderList) {
        if (head == null) {
            return;
        }
        process1(head.left,inOrderList);
        inOrderList.add(head);
        process1(head.right,inOrderList);
    }

    public static boolean checkBst2(Node node){
        if (node != null) {
            int preValue = Integer.MIN_VALUE;
            Stack<Node> stack = new Stack<>();
            while (!stack.isEmpty() || node != null) {
                if (node != null) {
                    stack.push(node);
                    node = node.left;
                } else  {
                    node = stack.pop();
                    System.out.println(node.value);
                    if (node.value <= preValue) {
                        return false;
                    } else {
                        preValue = node.value;
                    }
                    node = node.right;
                }
            }
        }
        return true;
    }
}