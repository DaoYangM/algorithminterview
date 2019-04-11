package top.daoyang.setandmap;

import java.util.Set;
import java.util.HashSet;

public class HappyNumber {
    public boolean isHappy(int n) {
        if (n == 0) return false;
        Set<Integer> rep = new HashSet<>();

        while (n != 1) {
            int newN = 0;
            while (n != 0) {
                newN += Math.pow(n % 10, 2);
                n /= 10;
            }
            n = newN;
            if (rep.contains(n))
                return false;
            rep.add(n);
        }

        return true;
    }
}