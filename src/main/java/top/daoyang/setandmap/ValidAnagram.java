package top.daoyang.setandmap;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public boolean test(String s, String t) {
        Map<Character, Integer> sm = new HashMap<>();
        Map<Character, Integer> tm = new HashMap<>();

        for (char var : s.toCharArray()) {
            Integer exist = sm.get(var);
            if (exist == null) {
                sm.put(var, 0);
            } else {
                sm.put(var, exist + 1);
            }
        }
 
        for (char var : t.toCharArray()) {
            Integer exist = tm.get(var);
            if (exist == null) {
                tm.put(var, 0);
            } else {
                tm.put(var, exist + 1);
            }
        }

        if (sm.size() != tm.size())
            return false;
            
        for (Map.Entry<Character, Integer> entry : sm.entrySet()) {
            if (!tm.get(entry.getKey()).equals(entry.getValue())) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ValidAnagram validAnagram = new ValidAnagram();
        boolean test = validAnagram.test("anagram", "namarag");
        System.out.println(test);
    }
}