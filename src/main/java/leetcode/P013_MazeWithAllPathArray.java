package leetcode;

import java.util.Arrays;

public class P013_MazeWithAllPathArray {
    public static void main(String[] args) {
        boolean[][] maze = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };
        int[][] resultArr = new int[maze.length][maze[0].length];
        allWays(maze, 0, 0, "", resultArr, 1);
    }

    private static void allWays(boolean[][] maze, int row, int col, String result, int[][] resultArr, int step) {
        if (row == maze.length - 1 && col == maze[row].length - 1) {
            resultArr[row][col] = step;
            for (int[] resultArrRow: resultArr) {
                System.out.println(Arrays.toString(resultArrRow));
            }
            System.out.println(result);
            System.out.println();
            return;
        }

        if (!maze[row][col]) {
            return;
        }

        maze[row][col] = false;
        resultArr[row][col] = step;
        if (row < maze.length - 1) {
            allWays(maze, row + 1, col, result + "D", resultArr, step + 1);
        }

        if (col < maze[row].length - 1) {
            allWays(maze, row, col + 1, result + "R", resultArr, step + 1);
        }

        if (row > 0) {
            allWays(maze, row - 1, col, result + "U", resultArr, step + 1);
        }

        if (col > 0) {
            allWays(maze, row, col - 1, result + "L", resultArr, step + 1);
        }

        maze[row][col] = true;
        resultArr[row][col] = 0;
    }

}
