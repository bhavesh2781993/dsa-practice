package algorithms.recursion;

public class P008_ReverseNo {
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(reverse(n));
    }
    private static double reverse(int num) {
        if (num == 0) {
            return 0;
        }
        int digits = (int) Math.log10(num);
        double sum = num % 10 * Math.pow(10, digits);
        return sum + reverse(num / 10);
    }
}
