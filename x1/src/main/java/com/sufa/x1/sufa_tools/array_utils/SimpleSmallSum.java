package com.sufa.x1.sufa_tools.array_utils;

// 暴力求小和问题
public class SimpleSmallSum {
    public static int GetSmallPlus(int[] arr) {
        if (arr == null || arr.length < 1) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    sum += arr[j];
                }
            }
        }
        return sum;
    }

}
