package leetcode;

import java.util.HashMap;
import java.util.Map;

public class P004_RomanToInt {


    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
    private static int romanToInt(String roman) {
        Map<String, Integer> romanIntValMap = new HashMap<>();
        romanIntValMap.put("I", 1);
        romanIntValMap.put("IV", 4);
        romanIntValMap.put("V", 5);
        romanIntValMap.put("IX", 9);
        romanIntValMap.put("X", 10);
        romanIntValMap.put("XL", 40);
        romanIntValMap.put("L", 50);
        romanIntValMap.put("XC", 90);
        romanIntValMap.put("C", 100);
        romanIntValMap.put("CD", 400);
        romanIntValMap.put("D", 500);
        romanIntValMap.put("CM", 900);
        romanIntValMap.put("M", 1000);

        int ans = 0;
        while (true) {
            if (roman.isEmpty()) {
                break;
            }
            if (roman.length() >= 2 && romanIntValMap.containsKey(roman.substring(0, 2))) {
                ans += romanIntValMap.get(roman.substring(0, 2));
                roman = roman.substring(2);
            } else {
                ans += romanIntValMap.get(roman.substring(0, 1));
                roman = roman.substring(1);
            }
        }

        return ans;
    }
}
