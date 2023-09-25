package algorithms.recursion;

public class P003_Fibonacci {

    public static void main(String[] args) {
        final int no = fibonacci(6);
        System.out.println(no);
    }

    private static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
