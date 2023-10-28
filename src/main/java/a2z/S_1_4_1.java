package a2z;

public class S_1_4_1 {
    public static void main(String[] args) {
        int num = 333;
        System.out.println(count(num));
        System.out.println(Math.floor(Math.log10(num)) + 1);
    }

    // 123
    private static int count(int num) {
        int dup = num;
        int counter = 0;
        while (num > 0) {
            int rem = num % 10;
            if (rem != 0 && dup % rem == 0) {
                counter++;
            }
            num /= 10;
        }
        return counter;
    }

}
