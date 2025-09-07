package com.sufa.x1.sufa_tools.array_utils;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.Arrays;

@SpringBootTest
class FastSortTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void process() {
        int[] test = new int[]{4, 3, 5, 6, 5, 0, 1, 7, 8, 5};
        FastSort.process(test, 0, test.length - 1);
        System.out.println(Arrays.toString(test));
        Assert.isTrue(test[0] != 4, "FastSortTest failed");
    }
}