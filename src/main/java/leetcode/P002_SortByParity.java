package leetcode;

import java.util.Arrays;

public class P002_SortByParity {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            while(start < arr.length && arr[start] %2 == 0) {
                start++;
            }
            while(end >= 0 && arr[end] % 2 != 0) {
                end--;
            }
            if (start < end) {
                swap(arr, start, end);
            }
        }
    }

    private static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
