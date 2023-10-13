package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P009_DiceSum {
    public static void main(String[] args) {
        diceSum(4, "");

        final List<String> result = diceSumList(4, "");
        System.out.println(result);
    }

    private static void diceSum(int unprocessed, String ans) {
        if (unprocessed == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 1; i <= 6 && i <= unprocessed; i++) {
            diceSum(unprocessed - i, ans + " " + i);
        }
    }

    private static List<String> diceSumList(int unprocessed, String ans) {
        if (unprocessed == 0) {
            return List.of(ans);
        }

        List<String> tempAns = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= unprocessed; i++) {
            tempAns.addAll(diceSumList(unprocessed - i, ans + " " + i));
        }
        return tempAns;
    }
}
