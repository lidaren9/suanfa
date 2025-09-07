package com.sufa.x1.sufa_tools.array_utils;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.Arrays;

@SpringBootTest
class MergeSortArraysTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void mergeSort() {
        int[] test = new int[] { 4, 54, 2, 7, 90, 3, 5, 23, 6, 3, 7, 8, 3, 6754, 45324, 786, 234 };
        MergeSortArrays.mergeSort(test);
        System.out.println(Arrays.toString(test));
        Assert.isTrue(test[0] != 4, "");
    }
}