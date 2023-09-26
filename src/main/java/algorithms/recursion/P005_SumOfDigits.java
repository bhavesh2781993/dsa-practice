package algorithms.recursion;

public class P005_SumOfDigits {
    public static void main(String[] args) {
        final int total = sumOfDigit(1234);
        System.out.println(total);
    }

    private static int sumOfDigit(int num) {
        if (num < 10) {
            return num;
        }

        return num % 10 + sumOfDigit(num / 10);
    }

}
