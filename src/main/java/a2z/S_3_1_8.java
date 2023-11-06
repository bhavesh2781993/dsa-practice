package a2z;

public class S_3_1_8 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(linearSearch(arr, 55));
    }

    private static int linearSearch(int[] arr, int target) {
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
