package a2z;

import java.util.HashMap;
import java.util.Map;

public class S_3_1_13 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 1, 5};
        int target = 4;
        System.out.println(longestSubArrayWithGivenSumBrut(arr, target));
        System.out.println(longestSubArrayWithGivenSumBetter(arr, target));
        System.out.println(longestSubArrayWithGivenSumOpt(arr, target));
//        System.out.println(longestSubArrayWithGivenSumOpt1(arr, target));
    }

    private static int longestSubArrayWithGivenSumBrut(int[] arr, int target) {
        int max = 0;
        for(int i = 0; i < arr.length; i++) {
            int tempSum = 0;
            for(int j = i; j < arr.length; j++) {
                tempSum += arr[j];
                if (tempSum == target) {
                    max = Math.max(max, j - i + 1);
                }
            }
        }
        return max;
    }

    // For positives only
    private static int longestSubArrayWithGivenSumBetter(int[] arr, int target) {
        Map<Integer, Integer> cumSum = new HashMap<>();
        int total = 0;
        int maxLength = 0;
        for(int i = 0; i < arr.length; i++) {
            total += arr[i];
            if (total == target) {
                maxLength = i + 1;
            }

            int rem = total - target;
            if (cumSum.containsKey(rem)) {
                int start = cumSum.get(rem);
                maxLength = Math.max(maxLength, i - start);
            }

            // for positive nos only
            cumSum.put(total, i);
        }
        return maxLength;
    }

    // For positives Only
    private static int longestSubArrayWithGivenSumOpt(int[] arr, int target) {
        int maxLength = 0;
        int start = 0;
        int cumSum = 0;
        for (int i = 0; i < arr.length; i++) {
            cumSum += arr[i];
            if (cumSum == target) {
                maxLength = Math.max(maxLength, i - start + 1);
            }

            while (cumSum > target) {
                cumSum -= arr[start];
                start++;
            }
        }
        return maxLength;
    }

    // For positives + negative
    private static int longestSubArrayWithGivenSumOpt1(int[] arr, int target) {
        Map<Integer, Integer> cumSum = new HashMap<>();
        int total = 0;
        int maxLength = 0;
        for(int i = 0; i < arr.length; i++) {
            total += arr[i];
            if (total == target) {
                maxLength = i + 1;
            }

            int rem = total - target;
            if (cumSum.containsKey(rem)) {
                int start = cumSum.get(rem);
                maxLength = Math.max(maxLength, i - start);
            }

            // for positive + negative nos
            if (!cumSum.containsKey(total)) {
                cumSum.put(total, i);
            }
        }
        return maxLength;
    }
}
