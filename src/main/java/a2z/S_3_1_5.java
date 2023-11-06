package a2z;

import java.util.Arrays;

public class S_3_1_5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        leftRotateByOnePlace(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void leftRotateByOnePlace(int[] arr) {
        int firstElem = arr[0];
        for(int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = firstElem;
    }
}
