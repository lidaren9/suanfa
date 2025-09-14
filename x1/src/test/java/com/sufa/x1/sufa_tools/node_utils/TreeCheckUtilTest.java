package com.sufa.x1.sufa_tools.node_utils;

import com.sufa.x1.sufa_tools.base.Node;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class TreeCheckUtilTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void checkBst() {
        Node root1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);
        Node test1 = new Node(1);
        node5.left = node3;
        node5.right = node7;
        node3.left = node2;
        node3.right = node4;
        node2.left = root1;
        node7.left = node6;
        node7.right = node8;
        boolean checkBst = TreeCheckUtil.checkBst(node5);
        Assert.isTrue(checkBst, "");
        System.out.println(checkBst);
        node8.left = test1;
        boolean checkBst1 = TreeCheckUtil.checkBst(node5);
        Assert.isTrue(!checkBst1, "");
        System.out.println(checkBst1);
    }

    @Test
    void checkBst1() {
        Node root1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);
        Node test1 = new Node(1);
        node5.left = node3;
        node5.right = node7;
        node3.left = node2;
        node3.right = node4;
        node2.left = root1;
        node7.left = node6;
        node7.right = node8;
        boolean checkBst2 = TreeCheckUtil.checkBst1(node5);
        System.out.println(checkBst2);
        Assert.isTrue(!checkBst2, "");
    }

    @Test
    void checkBst2() {
        Node root1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);
        Node test1 = new Node(1);
        node5.left = node3;
        node5.right = node7;
        node3.left = node2;
        node3.right = node4;
        node2.left = root1;
        node7.left = node6;
        node7.right = node8;
        boolean checkBst2 = TreeCheckUtil.checkBst2(node5);
        System.out.println(checkBst2);
        Assert.isTrue(checkBst2, "");
    }
}