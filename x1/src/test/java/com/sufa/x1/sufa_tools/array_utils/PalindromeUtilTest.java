package com.sufa.x1.sufa_tools.array_utils;

import com.sufa.x1.sufa_tools.base.Node;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class PalindromeUtilTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void isPalindrome1() {
        Node node1 = new Node(1);
        node1.next = new Node(2);
        node1.next.next = new Node(3);
        node1.next.next.next = new Node(2);
        node1.next.next.next.next = new Node(1);
        boolean isPalindrome1 = PalindromeUtil.isPalindrome1(node1);
        Assert.isTrue(isPalindrome1, "");
    }

    @Test
    void isPalindrome2() {
        Node node1 = new Node(1);
        node1.next = new Node(2);
        node1.next.next = new Node(3);
        node1.next.next.next = new Node(2);
        node1.next.next.next.next = new Node(1);
        boolean isPalindrome1 = PalindromeUtil.isPalindrome2(node1);
        Assert.isTrue(isPalindrome1, "");
    }

    @Test
    void isPalindrome3() {
        Node node1 = new Node(1);
        node1.next = new Node(2);
        node1.next.next = new Node(3);
        node1.next.next.next = new Node(2);
        node1.next.next.next.next = new Node(1);
        boolean isPalindrome1 = PalindromeUtil.isPalindrome3(node1);
        Assert.isTrue(isPalindrome1, "");
    }
}