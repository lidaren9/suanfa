package array_utils;

import java.util.Arrays;

/**
 * @author LIDAREN9
 */
public class FastSort {
    public static void main(String[] args) {
        int[] test = new int[]{4, 3, 5, 6, 5, 0, 1, 7, 8, 5};
        process(test, 0, test.length - 1);
        System.out.println(Arrays.toString(test));
    }

    public static void process(int[] arr, int l, int r) {
        if (l < r) {
            swap(arr, l + (int) (Math.random() * (r - l + 1)), r);
            int[] p = partition(arr, l, r);
            process(arr, l, p[0] - 1);
            process(arr, p[1] + 1, r);
        }
    }

    public static void swap(int[] arr, int des, int add) {
        int temp = arr[des];
        arr[des] = arr[add];
        arr[add] = temp;
    }

    public static int[] partition(int[] arr, int l, int r) {
        int less = l - 1;
        int more = r;
        while (l < more) {
            if (arr[l] < arr[r]) {
                swap(arr, ++less, l++);
            } else if (arr[l] > arr[r]) {
                swap(arr, --more, l);
            } else {
                l++;
            }
        }
        swap(arr, more, r);
        return new int[]{less + 1, more};
    }
}
