package a2z;

public class S_1_4_2 {
    public static void main(String[] args) {
        System.out.println(reverseNo(123));
    }

    private static int reverseNo(int num) {
        int reversedNum = 0;
        while (num > 0) {
            reversedNum = reversedNum * 10 + num % 10;
            num /= 10;
        }
        return reversedNum;
    }
}
