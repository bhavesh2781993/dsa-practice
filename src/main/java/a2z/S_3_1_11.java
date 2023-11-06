package a2z;

public class S_3_1_11 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 1, 0, 1};
        System.out.println(maxConsecutiveOnes(arr));
    }

    private static int maxConsecutiveOnes(int[] arr) {
        int max = 0;
        int currentCount = 0;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                currentCount++;
            } else {
                currentCount = 0;
            }
            max = Math.max(currentCount, max);
        }
        return max;
    }
}
