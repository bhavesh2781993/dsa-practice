package algorithms.recursion;

public class P002_Factorial {
    public static void main(String[] args) {
        final long response = factorial(5);
        System.out.println(response);
    }

    private static long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

}
