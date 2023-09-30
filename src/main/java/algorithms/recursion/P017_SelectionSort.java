package algorithms.recursion;

import java.util.Arrays;

public class P017_SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 4, 3, 1};
        sort(arr, 4, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr, int iterations, int index, int maxIndex) {
        if (iterations == 0) {
            return;
        }

        if (index < iterations) {
            maxIndex = arr[index] > arr[maxIndex] ? index : maxIndex;
            sort(arr, iterations, index + 1, maxIndex);
        } else {
            swap(arr, iterations - 1, maxIndex);
            sort(arr, iterations - 1, 0, 0);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
