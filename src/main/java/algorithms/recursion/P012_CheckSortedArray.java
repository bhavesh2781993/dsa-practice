package algorithms.recursion;

public class P012_CheckSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        final boolean isSorted = isSorted(arr);
        System.out.println(isSorted);
    }
    private static boolean isSorted(int[] arr) {
        return helper(arr, 0);
    }

    private static boolean helper(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }

        return arr[index] < arr[index + 1] && helper(arr, index + 1);
    }

}
