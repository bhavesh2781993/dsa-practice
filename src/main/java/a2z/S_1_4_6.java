package a2z;

/**
 * Find if given number is Prime Number
 */
public class S_1_4_6 {
    public static void main(String[] args) {
        int num = 14;
        System.out.println(isPrimeBrut(num));
        System.out.println(isPrimeOpt(num));
    }

    private static boolean isPrimeBrut(int num) {
        int count = 0;
        for(int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        return count <= 2;
    }

    private static boolean isPrimeOpt(int num) {
        int count = 0;
        for(int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                count++;
                if (num / i != i) {
                    count++;
                }
            }
        }

        return count == 2;
    }
}
