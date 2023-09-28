package algorithms.recursion;

public class P014_RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
        int target = 5;
        int index = rotatedBinarySearch(arr, target);
        System.out.println(index);

        index = rotatedBinarySearch(arr, target, 0, arr.length - 1);
        System.out.println(index);
    }

    private static int rotatedBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[start] < arr[mid] && target >= arr[start] && target < arr[mid]) {
                end = mid - 1;
            } else if (arr[start] > arr[mid] && target >= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    private static int rotatedBinarySearch(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }

        if (arr[start] < arr[mid] && target >= arr[start]) {
            return rotatedBinarySearch(arr, target, start, mid - 1);
        } else if (arr[start] > arr[mid] && target >= arr[start]) {
            return rotatedBinarySearch(arr, target, start, mid - 1);
        } else {
            return rotatedBinarySearch(arr, target, mid + 1, end);
        }
    }

}
