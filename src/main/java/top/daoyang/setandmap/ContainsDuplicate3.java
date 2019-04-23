package top.daoyang.setandmap;

import java.util.TreeSet;

public class ContainsDuplicate3 {
    public boolean containsNearbyAlmostDuplicate(Long[] nums, Long k, Long t) {
        TreeSet<Long> set = new TreeSet<>();

        int L = 0, R = -1;
        
        while (L < nums.length && R + 1 < nums.length) {
            if (++R - L > k) {
                set.remove((long)nums[L++]);
            }

            Long sv;
            if ((sv = set.ceiling((long) (nums[R] - (long)t))) != null && sv <= (long)nums[R] + (long)t) {
                return true;
            } else {
                set.add((long) nums[R]);
            }            
        }

        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate3 dup = new ContainsDuplicate3();
        boolean res = dup.containsNearbyAlmostDuplicate(new Long[] {(long)-2147483648, (long)-2147483647 }, (long)3, (long)3);
        System.out.println(res);
    }
}