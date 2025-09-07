package com.sufa.x1.sufa_tools.node_utils;

import com.sufa.x1.sufa_tools.base.Node;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;


@SpringBootTest
class CopyListWithRandomTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void copyListWithRand1() {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        n1.rand = n3;
        n2.rand = n3;
        n3.rand = n2;
        n1.next = n2;
        n2.next = n3;
        Node node = CopyListWithRandom.copyListWithRand1(n1);
        System.out.println(node);
        Assert.isTrue(node != null, "CopyListWithRandom.copyListWithRand1() failed");
    }
}