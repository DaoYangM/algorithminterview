package top.daoyang.setandmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> freq = new HashMap<>();
        
        for (String s : strs) {
            char[] sc = s.toCharArray();
            Arrays.sort(sc);
            
            String nsc = new String(sc);
            List<String> list = freq.get(nsc);
            if (list == null) {
                list = new ArrayList<>();
                list.add(s);
                freq.put(nsc, list);
            } else {
                list.add(s);
            }
        }

        List<List<String>> res = new ArrayList<>();
        
        for (Map.Entry<String, List<String>> entry : freq.entrySet()) {
            res.add(entry.getValue());
        }

        return res;
    }
}