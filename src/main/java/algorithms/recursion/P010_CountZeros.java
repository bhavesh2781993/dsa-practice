package algorithms.recursion;

public class P010_CountZeros {
    public static void main(String[] args) {
        System.out.println(count(301000));
    }

    private static int count(int num) {
        return countHelper(num, 0);
    }

    private static int countHelper(int num, int count) {
        if (num == 0) {
            return count;
        }
        if (num % 10 == 0) {
            return countHelper(num / 10, count + 1);
        } else {
            return countHelper(num / 10, count);
        }
    }
}
