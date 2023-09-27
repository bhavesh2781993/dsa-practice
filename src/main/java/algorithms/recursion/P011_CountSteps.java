package algorithms.recursion;

public class P011_CountSteps {
    public static void main(String[] args) {
        final int count = countSteps(41);
        System.out.println(count);
    }

    private static int countSteps(int num) {
        if (num <= 0) {
            return 0;
        }
        if (num % 2 == 0) {
            num = num / 2;
        } else {
            num = num - 1;
        }
        return 1 + countSteps(num);
    }

}
