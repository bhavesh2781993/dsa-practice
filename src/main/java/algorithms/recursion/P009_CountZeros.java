package algorithms.recursion;

public class P009_CountZeros {
    public static void main(String[] args) {
        int num = 100;
        System.out.println(count(num));
    }

    private static int count(int num) {
        if (num <= 0) {
            return 0;
        }

        if (num % 10 == 0) {
            return 1 + count(num / 10);
        }
        return count(num / 10);
    }

}
