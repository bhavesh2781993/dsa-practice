package leetcode;

public class P014_NQueens {
    public static void main(String[] args) {
        int nQueens = 5;
        boolean[][] board = new boolean[nQueens][nQueens];
        final int count = nQueens(board, 0);
        System.out.println(count);
    }

    private static int nQueens(boolean[][] board, int row)  {
        if (row == board.length) {
            printBoard(board);
            return 1;
        }

        int count = 0;
        for (int i = 0; i < board[row].length; i++) {
            if (isAllowed(board, row, i)) {
                board[row][i] = true;
                count += nQueens(board, row + 1);
                board[row][i] = false;
            }
        }
        return count;
    }

    private static boolean isAllowed(boolean[][] board, int row, int col) {
        boolean allowed = true;

        // Up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col]) {
                allowed = false;
                break;
            }
        }
        if (!allowed) {
            return false;
        }

        // Diagonal Left
        int count = Math.min(row, col);
        for (int i = 0; i < count; i++) {
            if (board[row - i - 1][col - i - 1]) {
                allowed = false;
                break;
            }
        }
        if (!allowed) {
            return false;
        }

        // Diagonal Right
        count = Math.min(row, board.length - col - 1);
        for (int i = 0; i < count; i++) {
            if (board[row - i - 1][col + i + 1]) {
                allowed = false;
                break;
            }
        }
        if (!allowed) {
            return false;
        }

        return allowed;
    }

    private static void printBoard(boolean[][] board) {
        for (int j = 0; j < board.length; j++) {
            for (int i = 0; i < board[j].length; i++) {
                if (board[j][i]) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
