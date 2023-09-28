package algorithms.recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P013_LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 18, 9, 9};
        int target = 9;

        final int i = linearSearch(arr, 0, target);
        System.out.println(i);

        findAllIndices(arr, 0, target);
        System.out.println(list);

        final ArrayList<Integer> list1 = findAllIndices(arr, 0, target, new ArrayList<>());
        System.out.println(list1);

        final List<Integer> list2 = findAllIndices1(arr, 0, target);
        System.out.println(list2);
    }

    private static int linearSearch(int[] arr, int index, int target) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return linearSearch(arr, index + 1, target);
        }
    }

    private static ArrayList<Integer> list = new ArrayList<>();
    private static void findAllIndices(int[] arr, int index, int target) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        findAllIndices(arr, index + 1, target);
    }

    private static ArrayList<Integer> findAllIndices(int[] arr,
                                                     int index,
                                                     int target,
                                                     ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndices(arr, index + 1, target, list);
    }

    private static List<Integer> findAllIndices1(int[] arr, int index, int target) {
        if (index == arr.length) {
            return Collections.emptyList();
        }

        final List<Integer> list = new ArrayList<>();
        if (arr[index] == target) {
            list.add(index);
        }

        list.addAll(findAllIndices1(arr, index + 1, target));
        return list;
    }
}
