package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P012_MazeWithAllPath {
    public static void main(String[] args) {
        boolean[][] maze = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };
        final List<String> result = allWays(maze, 0, 0, "");
        System.out.println(result);
    }

    private static List<String> allWays(boolean[][] maze, int row, int col, String result) {
        if (row == maze.length - 1 && col == maze[row].length - 1) {
            return List.of(result);
        }

        if (!maze[row][col]) {
            return Collections.emptyList();
        }

        maze[row][col] = false;
        List<String> tempResult = new ArrayList<>();
        if (row < maze.length - 1) {
            tempResult.addAll(allWays(maze, row + 1, col, result + "D"));
        }

        if (col < maze[row].length - 1) {
            tempResult.addAll(allWays(maze, row, col + 1, result + "R"));
        }

        if (row > 0) {
            tempResult.addAll(allWays(maze, row - 1, col, result + "U"));
        }

        if (col > 0) {
            tempResult.addAll(allWays(maze, row, col - 1, result + "L"));
        }

        maze[row][col] = true;
        return tempResult;
    }
}
