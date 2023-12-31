package algorithms.sorting;

import java.util.Arrays;

public class P004_CyclicSort {

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 0};
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i) {
                swap(arr, i, arr[i]);
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
