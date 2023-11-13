package a2z;

import java.util.ArrayList;
import java.util.Arrays;

public class S_4_1_6{
    public static void main(String[] args) {
        final ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(4);
        arr.add(13);
        arr.add(13);
        arr.add(13);
        arr.add(20);
        arr.add(40);
        int target = 13;

        final int first = firstOccurrence(arr, target);

        int[] ans = {-1 , -1};
        if (first != -1) {
            ans = new int[] {first, lastOccurrence(arr, target)};
        }

        System.out.println(Arrays.toString(ans));
    }

    private static int lastOccurrence(ArrayList<Integer> arr, int target) {
        int start = 0;
        int end = arr.size() - 1;
        int last = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr.get(mid) == target) {
                last = mid;
                start = mid + 1;
            } else if (arr.get(mid) < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return last;
    }

    private static int firstOccurrence(ArrayList<Integer> arr, int target) {
        int start = 0;
        int end = arr.size() - 1;
        int first = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr.get(mid) == target) {
                first = mid;
                end = mid - 1;
            } else if (arr.get(mid) < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return first;
    }

}
