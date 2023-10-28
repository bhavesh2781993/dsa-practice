package a2z;

public class S_1_4_3 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(122));
    }

    private static boolean isPalindrome(int num) {
        int dup = num;
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        return dup == rev;
    }

}
