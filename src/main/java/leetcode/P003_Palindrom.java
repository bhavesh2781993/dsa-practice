package leetcode;

public class P003_Palindrom {
    public static void main(String[] args) {
        final boolean isPalindrom = isPalindrom(123);
        System.out.println(isPalindrom);
    }

    private static boolean isPalindrom(int no) {
        int originalNo = no;
        if (originalNo < 0) {
            return false;
        }

        int ans = 0;
        while (no > 0) {
            ans *= 10;
            ans += no % 10;

            no /= 10;
        }

        if (originalNo == no) {
            return true;
        }
        return false;
    }
}
