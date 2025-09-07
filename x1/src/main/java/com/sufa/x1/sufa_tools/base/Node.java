package com.sufa.x1.sufa_tools.base;
/**
 * @author LIDAREN
 */
public class Node {
    public Node next;
    public int value;
    public Node rand;
    public Node left;
    public Node right;

    public Node(int data) {
        this.value = data;
    }

    @Override
    public String toString() {
        return value + "->" + next;
    }
}
