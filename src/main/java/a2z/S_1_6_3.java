package a2z;

import java.util.HashMap;
import java.util.Map;

public class S_1_6_3 {
    public static void main(String[] args) {
        int[] input = {10, 5, 10, 15, 15, 10, 5, 5, 5};
        minMaxFrequency(input);
    }

    private static void minMaxFrequency(int[] arr) {
        Map<Integer, Integer> numFreq = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {
            if (numFreq.containsKey(arr[i])) {
                numFreq.put(arr[i], numFreq.get(arr[i]) + 1);
            } else {
                numFreq.put(arr[i], 1);
            }
        }

        int min = Integer.MAX_VALUE;
        int minEle = 0;
        int max = Integer.MIN_VALUE;
        int maxEle = 0;

        for(Map.Entry<Integer, Integer> entry: numFreq.entrySet()) {
            if (entry.getValue() < min) {
                min = entry.getValue();
                minEle = entry.getKey();
            }
            if (entry.getValue() > max) {
                max = entry.getValue();
                maxEle = entry.getKey();
            }
        }

        System.out.println("element: " + minEle + ", min freq: " + min);
        System.out.println("element: " + maxEle + ", max freq: " + max);
    }
}
