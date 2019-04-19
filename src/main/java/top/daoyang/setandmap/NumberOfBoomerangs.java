package top.daoyang.setandmap;

import java.util.HashMap;
import java.util.Map;

public class NumberOfBoomerangs {

    public int numberOfBoomerangs(int[][] points) {
        int res = 0;
        Map<Double, Integer> disMap = new HashMap<>();

        for (int i = 0; i < points.length; i++) {
            int[] a = points[i];
            for (int j = 0; j < points.length; j++) {
                if (i != j) {
                    double dis = distance(a, points[j]);
                    Integer v = disMap.get(dis);
                    if (v != null) {
                        disMap.put(dis, v + 1);
                    } else {
                        disMap.put(dis, 1);
                    }
                }
            }
            for (Map.Entry<Double, Integer> entry : disMap.entrySet()) {
                Integer v = entry.getValue();
                if (v > 1) {
                    res += (v * (v - 1));
                }                
            }

            disMap.clear();
        }

        return res;
    }

    private double distance(int[] a, int[] b) {
        return Math.sqrt(Math.pow(a[0] - b[0], 2) + Math.pow(a[1] - b[1], 2));
    }

    public static void main(String[] args) {
        NumberOfBoomerangs numberOfBoomerangs = new NumberOfBoomerangs();
        int res = numberOfBoomerangs.numberOfBoomerangs(new int[][] { { 0, 0 }, { 1, 0 }, { 2, 0 } });
        System.out.println(res);
    }
}