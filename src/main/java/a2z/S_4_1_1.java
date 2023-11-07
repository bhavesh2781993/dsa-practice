package a2z;

public class S_4_1_1 {
    public static void main(String[] args) {
        int[] arr = {3, 4, 6, 7, 9, 12, 16, 17};
        int target = 6;
        System.out.println(binarySearchIterative(arr, target));
        System.out.println(binarySearchRecursive(arr, target));
    }

    private static int binarySearchIterative(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    private static int binarySearchRecursive(int[] arr, int target) {
        return binarySearchRecursion(arr, 0, arr.length - 1, target);
    }

    private static int binarySearchRecursion(int[] arr, int start, int end, int target) {
        if (start > end) {
            return - 1;
        }

        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            return binarySearchRecursion(arr, start, mid - 1, target);
        } else {
            return binarySearchRecursion(arr, mid + 1, end, target);
        }
    }
}
