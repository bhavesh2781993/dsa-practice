package algorithms.recursion;

import java.util.Arrays;

import org.w3c.dom.css.CSSStyleDeclaration;

public class P018_MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1, 66};
        final int[] sortedArr = sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(sortedArr));
    }

    private static int[] sort(int[] arr, int start, int end) {
        if (start == end) {
            return new int[]{arr[start]};
        }
        int mid = start + (end - start) / 2;
        int[] sortedPart1 = sort(arr, start, mid);
        int[] sortedPart2 = sort(arr, mid + 1, end);
        return merge(sortedPart1, sortedPart2);
    }

    private static int[] merge(int[] part1, int[] part2) {
        int i = 0;
        int j = 0;
        int sortedIndex = 0;
        int[] sortedArr = new int[part1.length + part2.length];
        while(i < part1.length && j < part2.length) {
            if (part1[i] <= part2[j]) {
                sortedArr[sortedIndex] = part1[i];
                i++;
            } else {
                sortedArr[sortedIndex] = part2[j];
                j++;
            }
            sortedIndex++;
        }

        if (i <= part1.length) {
            for (int k = i; k < part1.length; k++) {
                sortedArr[sortedIndex] = part1[k];
                sortedIndex++;
            }
        }
        if (j <= part2.length) {
            for (int k = j; k < part2.length; k++) {
                sortedArr[sortedIndex] = part2[k];
                sortedIndex++;
            }
        }

        return sortedArr;
    }
}
