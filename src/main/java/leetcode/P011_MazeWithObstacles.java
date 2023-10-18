package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P011_MazeWithObstacles {
    public static void main(String[] args) {
        boolean[][] maze = {
            {true, true, true},
            {true, false, true},
            {true, true, true}
        };

        final List<String> result = ways(maze, 0, 0, "");
        System.out.println(result);
    }

    private static List<String> ways(boolean[][] maze, int row, int col, String result) {
        if (row == maze.length - 1 && col == maze[row].length - 1) {
            return List.of(result);
        }

        if (!maze[row][col]) {
            return Collections.emptyList();
        }

        List<String> tempResult = new ArrayList<>();
        if (row == maze.length - 1) {
            tempResult.addAll(ways(maze, row, col + 1, result + "R"));
        } else if (col == maze[row].length - 1) {
            tempResult.addAll(ways(maze, row + 1, col, result + "D"));
        } else {
            tempResult.addAll(ways(maze, row, col + 1, result + "R"));
            tempResult.addAll(ways(maze, row + 1, col, result + "D"));
        }
        return tempResult;
    }
}
