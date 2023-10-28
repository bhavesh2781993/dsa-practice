package epam;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class P01_WordCount {
    public static void main(String[] args) {
        String str = "HI EPAM bYe EPAM goodbye EPAM welcome ePAM Hi There epaM BYE bye EPaM";
        final Map<String, Long> wordCount = Arrays.stream(str.split(" "))
            .map(String::toUpperCase)
            .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        System.out.println(wordCount);
    }
}
