package a2z;

import java.util.Arrays;

public class S_3_1_6 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        leftRotateByNPlaces(arr, 6);
        System.out.println(Arrays.toString(arr));
    }

    private static void leftRotateByNPlaces(int[] arr, int n) {
        int rotation = n % arr.length;
        rotate(arr, 0, rotation - 1);
        rotate(arr, rotation, arr.length - 1);
        rotate(arr, 0, arr.length - 1);
    }

    private static void rotate(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
