package algorithms.recursion;

public class P006_ProductOfDigits {
    public static void main(String[] args) {
        final int ans = product(101);
        System.out.println(ans);
    }

    private static int product(int n) {
        if (n < 10) {
            return n;
        }
        return n % 10 * product(n / 10);
    }
}
