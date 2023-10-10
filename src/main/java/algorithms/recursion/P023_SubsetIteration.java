package algorithms.recursion;

import java.util.ArrayList;
import java.util.List;

public class P023_SubsetIteration {
    public static void main(String[] args) {
        subset(new int[] {1, 2, 3});
        subsetDuplicate(new int[] {1, 2, 2});
    }

    private static void subset(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for (int i = 0; i < arr.length; i++) {
            int iterations = result.size();
            for (int j = 0; j < iterations; j++) {
                List<Integer> tempResult = new ArrayList<>();
                tempResult.addAll(result.get(j));
                tempResult.add(arr[i]);
                result.add(tempResult);
            }
        }
        System.out.println(result);
    }

    private static void subsetDuplicate(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            start = 0;
            if (i > 0 && arr[i] == arr[i - 1]) {
                start = end + 1;
            }
            end = result.size() - 1;
            int iterations = result.size();
            for (int j = start; j < iterations; j++) {
                List<Integer> tempResult = new ArrayList<>();
                tempResult.addAll(result.get(j));
                tempResult.add(arr[i]);
                result.add(tempResult);
            }
        }
        System.out.println(result);
    }
}
