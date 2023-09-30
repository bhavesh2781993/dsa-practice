package algorithms.recursion;

import java.util.Arrays;

public class P016_BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4};
        sort(arr, 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr, int iterations, int index) {
        if (iterations == 0) {
            return;
        }

        if (index < iterations - 1) {
            if (arr[index] > arr[index + 1]) {
                swap(arr, index, index + 1);
            }
            sort(arr, iterations, index + 1);
        } else {
            sort(arr, iterations - 1, 0);
        }
    }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
