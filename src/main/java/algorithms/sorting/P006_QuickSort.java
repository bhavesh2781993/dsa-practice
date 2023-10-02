package algorithms.sorting;

import java.util.Arrays;
import java.util.Collections;

public class P006_QuickSort {
    public static void main(String[] args) {
        int[] arr = {-10, 1, 11, 66, 33, 88};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = arr[mid];

        while (start < end) {
            while(start < arr.length && arr[start] < pivot) {
                start++;
            }
            while(end > -1 && arr[end] > pivot) {
                end--;
            }
            if (start < end) {
                swap(arr, start, end);
            }
        }
        sort(arr, low, mid - 1);
        sort(arr, mid + 1, high);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
