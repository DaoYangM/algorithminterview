package top.daoyang.setandmap;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    
    public boolean isIsomorphic(String s, String t) {

        if (s.length() != s.length()) {
            return false;
        }
        
        Map<Character, Character> rep = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (rep.containsKey(s.charAt(i))) {
                if (!rep.get(s.charAt(i)).equals(t.charAt(i))) {
                    return false;
                }
            } else {
                if (rep.containsValue(t.charAt(i))) {
                    return false;
                }
                rep.put(s.charAt(i), t.charAt(i));
            }
        }

        return true;
    }
}