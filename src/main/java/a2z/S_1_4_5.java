package a2z;

public class S_1_4_5 {
    public static void main(String[] args) {
        printAllDivisors(36);
    }

    private static void printAllDivisors(int num) {
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + ", ");
                if (num / i != i) {
                    System.out.print(num / i + ", ");
                }
            }
        }
    }
}
