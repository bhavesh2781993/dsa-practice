package a2z;

public class S_4_1_4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7};
        int target = 2;
        System.out.println(searchInsertionPosition(arr, target));
    }

    private static int searchInsertionPosition(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = arr.length;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] >= target) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
