package com.sufa.x1.sufa_tools.array_utils;

import com.sufa.x1.sufa_tools.base.Node;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class NodeListPartitionTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void listPartition() {
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
        Node node = NodeListPartition.listPartition(test, 5);
        System.out.println(node);
        Assert.isTrue(node != null, "");
    }
}