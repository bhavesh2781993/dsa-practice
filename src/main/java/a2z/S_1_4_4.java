package a2z;

public class S_1_4_4 {
    public static void main(String[] args) {
        System.out.println(isArmstrong(370));
    }

    private static boolean isArmstrong(int num) {
        int dup = num;
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            sum += Math.pow(rem, 3);
            num /= 10;
        }
        return dup == sum;
    }
}
