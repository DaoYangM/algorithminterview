package top.daoyang.setandmap;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> contains = new HashSet<>();
        Set<Integer> res = new HashSet<>();
        
        for (int num : nums1) {
            contains.add(num);
        }

        for (int num : nums2) {
            if (contains.contains(num))
                res.add(num);
        }

        int[] arr = new int[res.size()];
        int i = 0;
        for (int var : res) {
            arr[i++] = var;
        }

        return arr;
    }    
}