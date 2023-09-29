package algorithms.patterns;

public class Patterns {
    public static void main(String[] args) {
        int n = 4;

        pattern1(n);
        System.out.println();

        pattern2(n);
        System.out.println();

        pattern3(n);
        System.out.println();

        pattern4(n);
        System.out.println();

        pattern5(n);
        System.out.println();

        pattern6(n);
        System.out.println();

        pattern7(n);
        System.out.println();

        pattern8(n);
        System.out.println();

    }

    private static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n - i + 1; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private static void pattern5(int n) {
        for (int i = 1; i <= (2 * n) - 1; i++) {
            int c = i <= n ? i : 2 * n - i;
            for (int j = 1; j <= c; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern6(int n) {
        for (int i = 1; i <= (2 * n - 1); i++) {
            int c = i <= n ? i : 2 * n - i;
            int spaces = n - c;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= c; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    private static void pattern7(int n) {
        for (int row = 1; row <= n; row++) {
            int spaces = n - row;
            for (int space = 1; space <= spaces; space++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    private static void pattern8(int n) {
        int originalN = n;
        n = 2 * n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int min = originalN - Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(min + " ");
            }
            System.out.println();
        }
    }
}
