package code_utils;

public class GetMax {
    public static int getMax(int[] arr) {
        return process(arr, 0, arr.length - 1);
    }

    public static int process(int[] arr, int left, int right) {
        if (left == right) {
            return arr[left];
        }
        int mid = left + ((right - left) >> 1);
        int leftMax = process(arr, left, mid);
        int rightMax = process(arr, mid + 1, right);
        return Math.max(leftMax, rightMax);
    }

    // T(N) = 2 * T(N / 2) + O(1)

    // T(N) = a * T(N / b) + O(N^d)
    // a：子问题规模被调用多少次
    // b: 子问题中数据是母问题数据量的倍数
    // d：其他子问题规模的时间复杂度

    // 只要满足master公式的
    // log(b, a) > d -> O(N^log(b, a))
    // log(b, a) = d -> O(N^d * logN)
    // log(b, a) < d -> O(N^d)

    public static void main(String[] args) {
        int[] test = new int[] {1, 4, 5, 6, 8, 2, 9, 10, 444, 21, 12};
        System.out.println("test 数组中最大值是：" + getMax(test));
    }
}
