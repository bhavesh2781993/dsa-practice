package algorithms.recursion;

public class P001_PrintNo {

    public static void main(String[] args) {
        print(5);
        printReverse(5);
        printBothWays(5);
    }

    private static void print(int num) {
        if (num <= 0) {
            return;
        }
        print(num - 1);
        System.out.println(num);
    }

    private static void printReverse(int num) {
        if (num <= 0) {
            return;
        }
        System.out.println(num);
        printReverse(num - 1);
    }

    private static void printBothWays(int num) {
        if (num <= 0) {
            return;
        }
        System.out.println(num);
        printBothWays(num - 1);
        System.out.println(num);
    }

}
