package a2z;

public class S_3_1_3 {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1};
        System.out.println(isNonDecreasingSorted(arr));
    }

    private static boolean isNonDecreasingSorted(int[] arr) {
        boolean sorted = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                sorted = false;
                break;
            }
        }
        return sorted;
    }

}
