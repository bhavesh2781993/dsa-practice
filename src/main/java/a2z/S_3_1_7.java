package a2z;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S_3_1_7 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 3, 4, 4, 5};
        System.out.println(Arrays.toString(arr));
//        moveZerosToEndBrut(arr);
        moveZerosToEndOpt(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void moveZerosToEndBrut(int[] arr) {
        List<Integer> numList = new ArrayList<>();
        Arrays.stream(arr)
            .filter(num -> num != 0)
            .forEach(numList::add);
        for(int i = 0; i < numList.size(); i++) {
            arr[i] = numList.get(i);
        }
        for(int i = numList.size(); i < arr.length; i++) {
            arr[i] = 0;
        }
    }

    private static void moveZerosToEndOpt(int[] arr) {
        int zeroIndx = -1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                zeroIndx = i;
                break;
            }
        }

        if (zeroIndx != -1) {
            for(int i = zeroIndx + 1; i < arr.length; i++) {
                if (arr[i] != 0) {
                    arr[zeroIndx] = arr[i];
                    arr[i] = 0;
                    zeroIndx = zeroIndx + 1;
                }
            }
        }
    }
}
