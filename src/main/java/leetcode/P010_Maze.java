package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P010_Maze {
    public static void main(String[] args) {
        final int totalWays = countWays(3, 3);
        System.out.println(totalWays);

        final List<String> ways = ways(3, 3, "");
        System.out.println(ways);

        final List<String> diagonalWays = waysDiagonal(3, 3, "");
        System.out.println(diagonalWays);
    }

    private static int countWays(int row, int column) {
        if (row == 1 || column == 1) {
            return 1;
        }

        int count = 0;
        count += countWays(row - 1, column);
        count += countWays(row, column - 1);
        return count;
    }

    private static List<String> ways(int row, int col, String result) {
        if (row == 1 && col == 1) {
            return List.of(result);
        }

        List<String> tempResult = new ArrayList<>();
        if (row == 1) {
            tempResult.addAll(ways(row, col - 1, result + "R"));
        } else if (col == 1) {
            tempResult.addAll(ways(row - 1, col, result + "D"));
        } else {
            tempResult.addAll(ways(row - 1, col, result + "D"));
            tempResult.addAll(ways(row, col - 1, result + "R"));
        }

        return tempResult;
    }

    private static List<String> waysDiagonal(int row, int col, String result) {
        if (row == 1 && col == 1) {
            return List.of(result);
        }

        List<String> tempResult = new ArrayList<>();
        if (row == 1) {
            tempResult.addAll(waysDiagonal(row, col - 1, result + "R"));
        } else if (col == 1) {
            tempResult.addAll(waysDiagonal(row - 1, col, result + "D"));
        } else {
            tempResult.addAll(waysDiagonal(row - 1, col, result + "D"));
            tempResult.addAll(waysDiagonal(row - 1, col - 1, result + "d"));
            tempResult.addAll(waysDiagonal(row, col - 1, result + "R"));
        }

        return tempResult;
    }
}
