package com.sufa.x1.sufa_tools.array_utils;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.Arrays;

@SpringBootTest
class HeapSortTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void heapSort() {
        int[] test = new int[]{3, 2, 4, 1, 6, 7, 3, 9, 4, 6, 2};
        HeapSort.heapSort(test);
        System.out.println(Arrays.toString(test));
        Assert.isTrue(test[0] != 3, "HeapSort failed");
    }
}