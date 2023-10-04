package algorithms.recursion;

import java.util.Collections;
import java.util.List;

public class P022_Subset {

    public static void main(String[] args) {
        subsets("cba", "");
    }

    private static void subsets(String unprocessed, String processed) {
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);
        subsets(unprocessed.substring(1), ch + processed);
        subsets(unprocessed.substring(1), processed);
    }

}
