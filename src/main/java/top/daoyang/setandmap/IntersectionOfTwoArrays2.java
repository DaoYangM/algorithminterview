package top.daoyang.setandmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfTwoArrays2 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> freq = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        
        for (int num : nums1) {
            Integer exist = freq.get(num);
            if (exist != null)
                freq.put(num, exist + 1);
            else 
                freq.put(num, 1);
        }

        for (int num : nums2) {
            Integer exist = freq.get(num);
            if (exist != num && exist > 0) {
                res.add(num);
                freq.put(num, exist - 1);
            }
        }

        return res.stream().mapToInt(i -> i).toArray();
    }    
}