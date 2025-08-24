package Sort;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author LIDAREN
 */
public class SortArrayDistanceLessK {
    public static void main(String[] args) {
        int[] test = new int[]{3, 1, 4, 6, 6, 9, 3, 5, 9};
        sortedArrDistanceLessK(test, 3);
        System.out.println(Arrays.toString(test));
    }

    public static void sortedArrDistanceLessK(int[] arr, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        int index = 0;
        for (; index <= Math.min(arr.length, k); index++) {
            heap.add(arr[index]);
        }
        int i = 0;
        for (; index < arr.length; i++, index++) {
            heap.add(arr[index]);
            arr[i] = heap.poll();
        }
        while (!heap.isEmpty()) {
            arr[i++] = heap.poll();
        }
    }
}
