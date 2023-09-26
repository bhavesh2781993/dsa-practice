package algorithms.recursion;

public class P004_SumOfN {
    public static void main(String[] args) {
        final int total = sum(5);
        System.out.println(total);
    }

    private static int sum(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + sum(n - 1);
    }

}
