package algorithms.recursion;

import java.util.ArrayList;
import java.util.List;

public class P024_Permutation {
    public static void main(String[] args) {
        permutation("abcd", "");

        final List<String> result = permutationList("abcd", "");
        System.out.println(result);

        final int count = permutationCount("abcd", "");
        System.out.println(count);
    }

    private static void permutation(String unprocessed, String processed) {
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }

        for (int i = 0; i < processed.length() + 1; i++) {
            String firstPart = processed.substring(0, i);
            String middlePart = unprocessed.substring(0, 1);
            String lastPart = processed.substring(i);
            String newProcessed = firstPart + middlePart + lastPart;
            String newUnprocessed = unprocessed.substring(1);
            permutation(newUnprocessed, newProcessed);
        }
    }

    private static List<String> permutationList(String unprocessed, String processed) {
        if (unprocessed.isEmpty()) {
            return List.of(processed);
        }

        List<String> result = new ArrayList<>();
        for (int i = 0; i < processed.length() + 1; i++) {
            String firstPart = processed.substring(0, i);
            String middlePart = unprocessed.substring(0, 1);
            String lastPart = processed.substring(i);
            String newProcessed = firstPart + middlePart + lastPart;
            String newUnprocessed = unprocessed.substring(1);
            result.addAll(permutationList(newUnprocessed, newProcessed));
        }
        return result;
    }

    private static int permutationCount(String unprocessed, String processed) {
        if (unprocessed.isEmpty()) {
            return 1;
        }

        int sum = 0;
        for (int i = 0; i < processed.length() + 1; i++) {
            String firstPart = processed.substring(0, i);
            String middlePart = unprocessed.substring(0, 1);
            String lastPart = processed.substring(i);
            String newProcessed = firstPart + middlePart + lastPart;
            String newUnprocessed = unprocessed.substring(1);
            sum += permutationCount(newUnprocessed, newProcessed);
        }
        return sum;
    }
}
