package com.sufa.x1.sufa_tools.array_utils;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class QuickSmallSumTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void smallSum() {
        int[] test = new int[]{1, 3, 4, 2, 5};
        int res = QuickSmallSum.smallSum(test);
        Assert.isTrue(res == 16, "");
    }
}