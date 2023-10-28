package a2z;

/**
 * Find GCD (Greatest Common Divisor) or HCF (Highest Common Factor) of given 2 numbers num1 and num2
 */
public class S_1_4_7 {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 15;
        System.out.println(gcdBrut(num1, num2));
        System.out.println(gcdOpt(num1, num2));
    }

    private static int gcdBrut(int a, int b) {
        int gcd = 1;
        for (int i = 2; i < a; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    /*
    Euclidean Algorithm
    gcd(a, b) = gcd(a - b, b) where a > b = gcd(a % b, b) where a > b
     */
    private static int gcdOpt(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        if (a == 0) {
            return b;
        } else {
            return a;
        }
    }


}
