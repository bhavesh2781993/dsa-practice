package algorithms.recursion;

public class P015_Pattern {
    public static void main(String[] args) {
        pattern1(4, 0);
        System.out.println();
        pattern2(4, 0);
    }

    private static void pattern1(int row, int col) {
        if (row <= 0) {
            return;
        }
        if (col == row) {
            System.out.println();
            pattern1(row - 1, 0);
        } else {
            System.out.print("* ");
            pattern1(row, col + 1);
        }
    }

    private static void pattern2(int row, int col) {
        if (row <= 0) {
            return;
        }
        if (col < row) {
            pattern2(row, col + 1);
            System.out.print("* ");
        } else {
            pattern2(row - 1, 0);
            System.out.println();
        }
    }
}
