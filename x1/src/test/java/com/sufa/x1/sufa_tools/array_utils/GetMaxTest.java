package com.sufa.x1.sufa_tools.array_utils;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class GetMaxTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getMax() {
        int[] test = new int[] {1, 4, 5, 6, 8, 2, 9, 10, 444, 21, 12};
        int max = GetMax.getMax(test);
        System.out.println("test 数组中最大值是：" + max);
        Assert.isTrue(max != -1, "HeapSort failed");
    }
}