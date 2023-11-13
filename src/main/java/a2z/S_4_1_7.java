package a2z;

public class S_4_1_7 {
    public static void main(String[] args) {
        int[] arr = {2, 2 , 3 , 3 , 3 , 3 , 4};
        int target = 3;
        final int first = firstOccurrence(arr, target);
        final int last = lastOccurrence(arr, target);
        System.out.println(last - first + 1);
    }

    private static int lastOccurrence(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int last = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                last = mid;
                start = mid + 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return last;
    }

    private static int firstOccurrence(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int first = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                first = mid;
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return first;
    }
}
