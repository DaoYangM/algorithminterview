package top.daoyang.setandmap;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        Map<Character, String> reflect = new HashMap<>();

        char[] pc = pattern.toCharArray();
        String[] sc = str.split(" ");
        
        if (pc.length != sc.length) 
            return false;

        for (int i = 0; i < pc.length; i++) {
            String value = reflect.get(pc[i]);
            if (value != null) {
                if (!value.equals(sc[i]))
                    return false;
            } else {
                if (reflect.containsValue(sc[i]))
                    return false;
                reflect.put(pc[i], sc[i]);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        WordPattern wordPattern = new WordPattern();
        System.out.println(wordPattern.wordPattern("abba", "dog cat cat dog"));
    }
}