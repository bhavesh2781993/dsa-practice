package epam;

public class P04_BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-21, -2, 1, 5, 7, 7, 7, 10, 10, 10, 10, 23};
        int target = 7;

        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                end = mid - 1;
            }
        }
        System.out.println(ans);
    }
}
