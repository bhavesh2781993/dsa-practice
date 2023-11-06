package a2z;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class S_3_1_4 {
    public static void main(String[] args) {
        List<Integer> arr = List.of(1, 1, 2, 2, 3, 4);
//        int index = removeDuplicateInPlaceFromSortedArrBrute(arr);
//        print(arr, index);
        int index = removeDuplicateInPlaceFromSortedArrOpt(arr);
        System.out.println(arr);
    }

    private static int removeDuplicateInPlaceFromSortedArrBrute(int[] arr) {
        Set<Integer> uniqueEle = new LinkedHashSet<>();
        for(int i = 0; i < arr.length; i++) {
            uniqueEle.add(arr[i]);
        }

        Iterator<Integer> itr = uniqueEle.iterator();
        int index = 0;
        while (itr.hasNext()) {
            arr[index] = itr.next();
            index++;
        }
        return index;
    }

    private static int removeDuplicateInPlaceFromSortedArrOpt(List<Integer> arr) {
        int index = 0;
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i).intValue() != arr.get(index)) {
                index++;
                arr.set(index, arr.get(i));
            }
        }
        return index + 1;
    }

    private static void print(int[] arr, int index) {
        for(int i = 0; i < index; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }
}
