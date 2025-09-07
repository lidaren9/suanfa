package com.sufa.x1.sufa_tools.array_utils;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.Arrays;

@SpringBootTest
class RadixSortTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void radixSort() {
        int[] test = new int[]{234, 56, 23, 7654, 2342, 54, 3423, 6543, 234, 76, 3453, 64, 4534, 78658, 4353, 34, 675, 86, 5432};
        RadixSort.radixSort(test,0, test.length - 1, RadixSort.getMaxBits(test));
        System.out.println(Arrays.toString(test));
        Assert.isTrue(test != null, "");
    }
}