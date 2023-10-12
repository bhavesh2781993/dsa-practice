package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P008_PhoneNoCharCombination {

    private static Map<Character, List<Character>> keyCharMap = new HashMap<>();

    static {
        keyCharMap.put('1', List.of('a', 'b', 'c'));
        keyCharMap.put('2', List.of('d', 'e', 'f'));
        keyCharMap.put('3', List.of('g', 'h', 'i'));
        keyCharMap.put('4', List.of('j', 'k', 'l'));
        keyCharMap.put('5', List.of('m', 'n', 'o'));
        keyCharMap.put('6', List.of('p', 'q', 'r'));
        keyCharMap.put('7', List.of('s', 't', 'u'));
        keyCharMap.put('8', List.of('v', 'w', 'x'));
        keyCharMap.put('9', List.of('y', 'z'));
    }
    public static void main(String[] args) {
        phoneKeypad("123", "");
        System.out.println();

        phoneKeypadAlternate("123", "");
        System.out.println();

        List<String> result = phoneKeypadList("123", "");
        System.out.println(result);

        final int count = phoneKeypadCount("123", "");
        System.out.println(count);
    }

    private static void phoneKeypad(String unprocessed, String processed) {
        if (unprocessed.isEmpty()) {
            System.out.print(processed + ", ");
            return;
        }

        char unprocessedChar = unprocessed.charAt(0);
        final List<Character> noCharList = keyCharMap.get(unprocessedChar);
        for (int i = 0; i < noCharList.size(); i++) {
            phoneKeypad(unprocessed.substring(1), processed + noCharList.get(i));
        }
    }

    private static void phoneKeypadAlternate(String unprocessed, String processed) {
        if (unprocessed.isEmpty()) {
            System.out.print(processed + ", ");
            return;
        }

        int digit = unprocessed.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            phoneKeypadAlternate(unprocessed.substring(1), processed + (char)('a' + i));
        }
    }

    private static List<String> phoneKeypadList(String unprocessed, String processed) {
        if (unprocessed.isEmpty()) {
            return List.of(processed);
        }

        List<String> result = new ArrayList<>();
        char unprocessedChar = unprocessed.charAt(0);
        final List<Character> noCharList = keyCharMap.get(unprocessedChar);
        for (int i = 0; i < noCharList.size(); i++) {
            result.addAll(phoneKeypadList(unprocessed.substring(1), processed + noCharList.get(i)));
        }
        return result;
    }

    private static int phoneKeypadCount(String unprocessed, String processed) {
        if (unprocessed.isEmpty()) {
            return 1;
        }

        int count = 0;
        char unprocessedChar = unprocessed.charAt(0);
        final List<Character> noCharList = keyCharMap.get(unprocessedChar);
        for (Character character : noCharList) {
            count += phoneKeypadCount(unprocessed.substring(1), processed + character);
        }
        return count;
    }
}
