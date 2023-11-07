package a2z;

public class S_4_1_2 {
    public static void main(String[] args) {
        int[] arr = {3,5,8,15,19};
        int target = 9;
        System.out.println(lowerBound(arr, target));
    }

    private static int lowerBound(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = arr.length;
        while (start <= end) {
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
