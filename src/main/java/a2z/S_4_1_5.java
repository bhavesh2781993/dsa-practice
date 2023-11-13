package a2z;

public class S_4_1_5 {
    public static void main(String[] args) {
        int[] arr = {3, 4, 4, 7, 8, 10};
        int target = 8;
        final int floor = floor(arr, target);
        System.out.println("floor: " + floor);

        final int ceil = ceiling(arr, target);
        System.out.println("ceil: " + ceil);
    }

    private static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ceil = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] > target) {
                ceil = arr[mid];
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ceil;
    }

    private static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int floor = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] < target) {
                floor = arr[mid];
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return floor;
    }
}
