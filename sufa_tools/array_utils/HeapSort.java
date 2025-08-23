package array_utils;

import javax.naming.PartialResultException;
import java.util.Arrays;

/**
 * @author LIDAREN
 */
public class HeapSort {
    public static void main(String[] args) {
        int[] test = new int[]{3, 2, 4, 1, 6, 7, 3, 9, 4, 6, 2};
        heapSort(test);
        System.out.println(Arrays.toString(test));
    }

    public static void heapSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            // 完成大根堆操作
            heapInsert(arr, i);
        }
        int heapSize = arr.length;
        swap(arr, 0, --heapSize);
        while (heapSize > 0) {
            heapIfy(arr, 0, heapSize);
            swap(arr, 0, --heapSize);
        }
    }

    public static void heapIfy(int[] arr, int index, int heapSize) {
        int left = index * 2 + 1;
        while (left < heapSize) {
            int largest = left + 1 < heapSize && arr[left + 1] > arr[left] ? left + 1 : left;
            largest = arr[largest] > arr[index] ? largest : index;
            if (largest == index) {
                break;
            }
            swap(arr, largest, index);
            index = largest;
            left = index * 2 + 1;
        }
    }

    /*
     *     0
     *   1    2
     *  3 4  5 6
     * */
    public static void heapInsert(int[] arr, int index) {
        while (arr[index] > arr[(index - 1) / 2]) {
            swap(arr, index, (index - 1) / 2);
            index = (index - 1) / 2;
        }

    }

    public static void swap(int[] arr, int add, int des) {
        int temp = arr[add];
        arr[add] = arr[des];
        arr[des] = temp;
    }
}
