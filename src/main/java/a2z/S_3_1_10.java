package a2z;

public class S_3_1_10 {
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNo(arr));
        System.out.println(missingNoBetter(arr));
        System.out.println(missingNoOpt(arr));
    }

    private static int missingNo(int[] arr) {
        int[] hashed = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            hashed[arr[i]] = 1;
        }

        for(int i = 0; i < hashed.length; i++) {
            if (hashed[i] == 0) {
                return i;
            }
        }

        return -1;
    }

    private static int missingNoBetter(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        int totalNo = arr.length;
        int total = (totalNo * (totalNo + 1)) / 2;

        return total - sum;
    }

    private static int missingNoOpt(int[] arr) {
        int tempXor = 0;
        for(int i = 0; i < arr.length + 1; i++) {
            tempXor = tempXor ^ i;
        }

        int arrXor = 0;
        for(int i = 0; i < arr.length; i++) {
            arrXor = arrXor ^ arr[i];
        }

        return tempXor ^ arrXor;
    }
}
