package algorithms.recursion;

import java.util.Arrays;

public class P019_MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 1};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr, int start, int end) {
        if (start == end) {
            return;
        }
        int mid = start + (end - start) / 2;
        sort(arr, start, mid);
        sort(arr, mid + 1, end);
        merge(arr, start, mid, end);
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        int[] sortedArr = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                sortedArr[k] = arr[i];
                i++;
            } else {
                sortedArr[k] = arr[j];
                j++;
            }
            k++;
        }

        if (i <= mid) {
            for (int l = i; l <= mid; l++) {
                sortedArr[k] = arr[l];
                k++;
            }
        }

        if (j <= end) {
            for (int l = j; l <= mid; l++) {
                sortedArr[k] = arr[l];
                k++;
            }
        }

        for (int l = 0; l < sortedArr.length; l++) {
            arr[start + l] = sortedArr[l];
        }
    }

}
