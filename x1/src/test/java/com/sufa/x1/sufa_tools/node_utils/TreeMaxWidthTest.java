package com.sufa.x1.sufa_tools.node_utils;

import com.sufa.x1.sufa_tools.base.Node;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TreeMaxWidthTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getMaxWidth() {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n4.left = null;
        n4.right = null;
        n5.left = null;
        n5.right = null;
        n3.left = n6;
        n3.right = n7;
        n6.left = null;
        n6.right = null;
        n7.left = null;
        n7.right = null;
        int maxWidth = TreeMaxWidth.getMaxWidth(n1);
        Assert.isTrue(maxWidth == 4, "maxWidth :" + maxWidth);
    }
}