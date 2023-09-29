package leetcode;

public class P003_CheckMonotonic {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3};
        System.out.println(isMonotonic(arr));
    }

    private static boolean isMonotonic(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAscending = arr[start] <= arr[end];
        while (start < arr.length - 1) {
            if (isAscending) {
                if (arr[start] <= arr[start + 1]) {
                    start++;
                } else {
                    return false;
                }
            } else {
                if (arr[start] >= arr[start + 1]) {
                    start++;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

}
