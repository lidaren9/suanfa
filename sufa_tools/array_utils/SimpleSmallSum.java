package array_utils;

// 暴力求小和问题
public class SimpleSmallSum {

    public static void main(String[] args) {
        int[] test = new int[] { 1, 3, 4, 2, 5 };
        int res =GetSmallPlus(test);
        System.out.println("小和结果为：" + res);
    }

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
