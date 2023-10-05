package leetcode;

import java.util.Arrays;

public class P005_MergeSortArrays {
    public static void main(String[] args) {
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        merge(nums1, m, nums2, n);
    }

    private static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = Arrays.copyOf(nums1, m);
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < temp.length && j < nums2.length) {
            if (temp[i] <= nums2[j]) {
                nums1[k] = temp[i];
                i++;
                k++;
            } else {
                nums1[k] = nums2[j];
                j++;
                k++;
            }
        }

        while (i < temp.length) {
            nums1[k] = temp[i];
            i++;
            k++;
        }
        while (j < nums2.length) {
            nums1[k] = nums2[j];
            j++;
            k++;
        }

        System.out.println(Arrays.toString(nums1));
    }
}
