package a2z;

import java.util.ArrayList;
import java.util.List;

public class S_3_1_9 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4, 5, 5};
        int[] arr2 = {2, 3, 4, 5, 5, 7, 8};
        final List<Integer> common = interSectionOfSortedArr(arr1, arr2);
        System.out.println(common);

        final List<Integer> union = unionOfSortedArr(arr1, arr2);
        System.out.println(union);

        final List<Integer> union1 = union(arr1, arr2);
        System.out.println(union1);
    }

    private static List<Integer> unionOfSortedArr(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        List<Integer> union = new ArrayList<>();
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                if (i == 0 || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
            } else if (arr1[i] > arr2[j]) {
                if (j == 0 || union.get(union.size() - 1) != arr2[j]) {
                    union.add(arr2[j]);
                }
                j++;
            } else {
                if (i == 0 || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
                j++;
            }
        }

        if (i < arr1.length) {
            while (i < arr1.length) {
                if (i == 0 || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
            }
        }

        if (j < arr2.length) {
            while (j < arr2.length) {
                if (j == 0 || union.get(union.size() - 1) != arr2[j]) {
                    union.add(arr2[j]);
                }
                j++;
            }
        }

        return union;
    }

    private static List<Integer> union(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int i = 0, j = 0; // pointers
        ArrayList<Integer > Union=new ArrayList<>(); // Uninon vector
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) // Case 1 and 2
            {
                if (Union.size() == 0 || Union.get(Union.size()-1) != arr1[i])
                    Union.add(arr1[i]);
                i++;
            } else // case 3
            {
                if (Union.size() == 0 || Union.get(Union.size()-1) != arr2[j])
                    Union.add(arr2[j]);
                j++;
            }
        }
        while (i < n) // IF any element left in arr1
        {
            if (Union.get(Union.size()-1) != arr1[i])
                Union.add(arr1[i]);
            i++;
        }
        while (j < m) // If any elements left in arr2
        {
            if (Union.get(Union.size()-1) != arr2[j])
                Union.add(arr2[j]);
            j++;
        }
        return Union;
    }
    private static List<Integer> interSectionOfSortedArr(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        List<Integer> intersection = new ArrayList<>();
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                intersection.add(arr1[i]);
                i++;
                j++;
            }
        }
        return intersection;
    }
}
