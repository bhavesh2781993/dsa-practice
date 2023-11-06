package a2z;

import java.util.Arrays;

public class S_3_1_1 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 10, 12, 8, 7};
        System.out.println(largestElementInArrBrut(arr));
        System.out.println(largestElementInArrOpt(arr));
        System.out.println(largestElementInArrOpt1(arr));
    }

    private static int largestElementInArrBrut(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    private static int largestElementInArrOpt(int[] arr) {
        return Arrays.stream(arr)
            .max()
            .getAsInt();
    }

    private static int largestElementInArrOpt1(int[] arr) {
        int max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
