package epam;

import java.util.HashMap;
import java.util.Map;

public class P03_SubArray {
    public static void main(String[] args) {
        int[] arr = {15, 4, -2, 2, -8, 1, 7, -4, 10, 23};
        zeroSumMaxArr1(arr);
        zeroSumMaxArr2(arr);
    }

    private static void zeroSumMaxArr1(int[] arr) {
        int maxLength = 0;
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == 0) {
                    counter++;
                    maxLength = Math.max(j - i + 1, maxLength);
                }
            }
        }

        System.out.println("max length: " + maxLength);
        System.out.println("count: " + counter);
    }

    private static void zeroSumMaxArr2(int[] arr) {
        Map<Integer, Integer> cumSum = new HashMap<>();
        int sum = 0;
        int maxLength = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == 0) {
                maxLength = i + 1;
            }

            if (cumSum.containsKey(sum)) {
                int len = i - cumSum.get(sum);
                maxLength = Math.max(maxLength, len);
            } else {
                cumSum.put(sum, i);
            }

        }

        System.out.println("max length: " + maxLength);
    }
}
