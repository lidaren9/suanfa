package array_utils;

import java.util.Arrays;

/**
 * @author LIDAREN
 */
public class RadixSort {
    public static void main(String[] args) {
        int[] test = new int[]{234, 56, 23, 7654, 2342, 54, 3423, 6543, 234, 76, 3453, 64, 4534, 78658, 4353, 34, 675, 86, 5432};
        radixSort(test, 0, test.length - 1, getMaxBits(test));
        System.out.println(Arrays.toString(test));
    }

    public static int getMaxBits(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            max = Math.max(max, i);
        }
        int res = 0;
        while (max != 0) {
            res++;
            max /= 10;
        }
        return res;
    }

    public static void radixSort(int[] arr, int l, int r, int digit) {
        final int radix = 10;
        int i = 0, j = 0;
        int[] bucket = new int[r - l + 1];
        for (int d = 1; d <= digit; d++) {
            int[] count = new int[radix];
            for (i = l; i <= r; i++) {
                j = getDigit(arr[i], d);
                count[j]++;
            }
            for (i = 1; i < radix; i++) {
                count[i] = count[i] + count[i - 1];
            }
            for (i = r; i >= l; i--) {
                j = getDigit(arr[i], d);
                bucket[count[j] - 1] = arr[i];
                count[j]--;
            }
            for (i = l, j = 0; i <= r; i++, j++) {
                arr[i] = bucket[j];
            }
        }
    }

    public static int getDigit(int x, int d) {
        return (x / (int) Math.pow(10, d - 1)) % 10;
    }
}
