package com.sufa.x1.sufa_tools.Sort;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.Arrays;


@SpringBootTest
class SortArrayDistanceLessKTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void SortArrayDistanceLessK() {
        int[] test = new int[]{3, 1, 4, 6, 6, 9, 3, 5, 9};
        SortArrayDistanceLessK.sortedArrDistanceLessK(test, 3);
        System.out.println(Arrays.toString(test));
        Assert.isTrue(test[0] == 1, "");
    }
}