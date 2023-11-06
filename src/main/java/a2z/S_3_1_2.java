package a2z;

import java.util.Arrays;

public class S_3_1_2 {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println(secondLargestElementInArrBrut(arr));
        System.out.println(secondLargestElementInArrOpt(arr));
        System.out.println(secondSmallestElementInArrOpt(arr));
    }

    private static int secondLargestElementInArrBrut(int[] arr) {
        Arrays.sort(arr);
        int max = arr[arr.length - 1];
        int secondLargest = -1;
        for(int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != max) {
                secondLargest = arr[i];
                break;
            }
        }
        return secondLargest;
    }

    // 2 Pointer method to check second largest in O(n) time
    private static int secondLargestElementInArrOpt(int[] arr) {
        int max = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < max && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
            if (arr[i] > max) {
                secondLargest = max;
                max = arr[i];
            }
        }
        return secondLargest;
    }

    private static int secondSmallestElementInArrOpt(int[] arr) {
        int min = arr[0];
        int secondMin = Integer.MAX_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > min && arr[i] < secondMin) {
                secondMin = arr[i];
            }
            if (arr[i] < min) {
                secondMin = min;
                min = arr[i];
            }
        }
        return secondMin;
    }
}
