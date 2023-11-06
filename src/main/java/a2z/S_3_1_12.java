package a2z;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class S_3_1_12 {
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};
        System.out.println(findSingleOccurringNoOpt(arr));
        System.out.println(findSingleOccurringNoBetter(arr));
    }

    private static int findSingleOccurringNoBetter(int[] arr) {
        final Map<String, Long> noOccurrences = Arrays.stream(arr)
            .mapToObj(String::valueOf)
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        final String s = noOccurrences.keySet()
            .stream()
            .filter(key -> noOccurrences.get(key) == 1)
            .findAny()
            .orElse("0");
        return Integer.valueOf(s);
    }

    private static int findSingleOccurringNoOpt(int[] arr) {
        int noOccurringOnce = 0;
        for(int i = 0; i < arr.length; i++) {
            noOccurringOnce = noOccurringOnce ^ arr[i];
        }
        return noOccurringOnce;
    }
}
