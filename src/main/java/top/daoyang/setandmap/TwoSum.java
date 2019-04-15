package top.daoyang.setandmap;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> locate = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (locate.containsKey(target - nums[i])) {
                return new int[]{locate.get(target-nums[i]), i};
            }
            locate.put(nums[i], i);
        }

        return new int[]{};
    }    
}