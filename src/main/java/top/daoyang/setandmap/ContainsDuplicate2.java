package top.daoyang.setandmap;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> dup = new HashSet<>();

        int L = 0, R = -1;

        while ( L < nums.length && ++R < nums.length) {
            if (R - L > k) {
                dup.remove(nums[L++]);
            }
            if (dup.contains(nums[R])) {
                return true;
            } else {
                dup.add(nums[R]);
            }            
        }

        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate2 containsDuplicate2 = new ContainsDuplicate2();
        boolean containsNearbyDuplicate = containsDuplicate2.containsNearbyDuplicate(new int[] { 1, 2, 3, 1 }, 3);
        System.out.println(containsNearbyDuplicate);
    }
}