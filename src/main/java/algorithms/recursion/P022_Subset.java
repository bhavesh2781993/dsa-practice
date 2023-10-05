package algorithms.recursion;

import java.util.ArrayList;
import java.util.List;

public class P022_Subset {

    public static void main(String[] args) {
        subsets("abc", "");
        final List<String> combinations = subsets1("abc", "");
        System.out.println(combinations);
    }

    private static void subsets(String unprocessed, String processed) {
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);
        subsets(unprocessed.substring(1), processed + ch);
        subsets(unprocessed.substring(1), processed);
    }

    private static List<String> subsets1(String unprocessed, String processed) {
        if (unprocessed.isEmpty()) {
            return List.of(processed);
        }
        List<String> l1 = new ArrayList<>();
        char ch = unprocessed.charAt(0);
        l1.addAll(subsets1(unprocessed.substring(1), processed + ch));
        l1.addAll(subsets1(unprocessed.substring(1), processed));
        return l1;
    }

}
