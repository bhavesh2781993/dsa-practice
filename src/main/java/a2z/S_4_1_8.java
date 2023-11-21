package a2z;

public class S_4_1_8 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 3};
        int target = 1;
        final int i = searchInRotatedSortedArr(arr, target);
        System.out.println(i);
    }

    private static int searchInRotatedSortedArr(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            if (arr[start] < arr[mid]) {
                if (target >= arr[start] && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid] && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
