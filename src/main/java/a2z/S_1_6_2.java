package a2z;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class S_1_6_2 {
    public static void main(String[] args) {
        int[] input = {10, 5, 10, 15, 10, 5};
        countFrequency(input);
        System.out.println();
        countFrequency1(input);
    }

    private static void countFrequency(int[] arr) {
        var maxElement = Arrays.stream(arr).max()
            .orElseThrow();

        int[] hash = new int[maxElement + 1];
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " -> " + hash[arr[i]]);
        }
    }

    private static void countFrequency1(int[] arr) {
        Map<Integer, Integer> numFreq = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            if (numFreq.containsKey(arr[i])) {
                numFreq.put(arr[i], numFreq.get(arr[i]) + 1);
            } else {
                numFreq.put(arr[i], 1);
            }
        }
        numFreq.forEach((k, v) -> System.out.println(k + " -> " + v));
    }
}
