package top.daoyang.slidingwindow;

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagramsInAString {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int L = 0, R = 0, sL = s.length(), pL = p.length(), count = pL;
        int[] data = new int[256];
        char[] sc = s.toCharArray();

        for (char c : p.toCharArray()) 
            data[c]++;
        
        while (R < sL) {
            if (data[sc[R++]]-- >= 1) 
                count--;
            if (count == 0)
                res.add(L);
            if (R - L == pL && data[sc[L++]]++ >= 0)
                count++;
        }

        return res;
    }

    public static void main(String[] args) {
        new FindAllAnagramsInAString().findAnagrams("cbaebabacd", "abc");
    }
}