package com.sufa.x1.sufa_tools.array_utils;

import java.util.Arrays;

// 归并排序
public class MergeSortArrays {
    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        process(arr, 0, arr.length - 1);
    }

    public static void process(int[] arr, int L, int R) {
        if (L == R) {
            return;
        }
        int mid = L + ((R - L) >> 1);
        process(arr, L, mid);
        process(arr, mid + 1, R);
        merge(arr, L, mid, R);
    }

    public static void merge(int[] arr, int L, int M, int R) {
        int[] help = new int[R - L + 1];
        int i = 0;
        int p1 = L;
        int p2 = M + 1;
        while (p1 <= M && p2 <= R) {
            help[i++] = arr[p1] <= arr[p2] ? arr[p1++] : arr[p2++];
        }
        while (p1 <= M) {
            help[i++] = arr[p1++];
        }
        while (p2 <= R) {
            help[i++] = arr[p2++];
        }
        for (int j = 0; j < help.length; j++) {
            arr[L + j] = help[j];
        }
    }
    // T(N) = 2 * T ( N / 2) + O(N)
    // a = 2, b = 2, d = 1
    // 只要满足master公式的
    // log(b, a) > d -> O(N^log(b, a))
    // log(b, a) = d -> O(N^d * logN)
    // log(b, a) < d -> O(N^d)
    // 因此时间复杂度为： O(N*logN)
}
