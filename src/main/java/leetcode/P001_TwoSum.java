package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P001_TwoSum {
    public static void main(String[] args) {
        int[] nums = {3, 3};
        int target = 6;
        int[] ans = {-1, -1};
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int numComplement = target - nums[i];
            if (numMap.containsKey(numComplement)) {
                ans = new int[] { numMap.get(numComplement), i };
            }
            numMap.put(nums[i], i);
        }
        System.out.println(Arrays.toString(ans));
    }

}
