package top.daoyang.setandmap;

public class SortCharactersByFrequency {
    public String frequencySort(String s) {
        int[] freq = new int[256];
        char[] sc = s.toCharArray();

        for (char c : sc) {
            freq[c]++;
        }

        quickSort(sc, freq, 0, sc.length - 1);

        return new String(sc);
    }

    private void quickSort(char[] sc, int[] freq, int L, int R) {
        if (L >= R) return;

        int lt = L, gt = R + 1;

        for (int i = L + 1; i != gt; i++) {
            if (freq[sc[i]] < freq[sc[L]]) {
                swap(sc, --gt, i--);
            } else if (freq[sc[i]] > freq[sc[L]]) {
                swap(sc, ++lt, i);
            } else {
                if (sc[i] > sc[L]) {
                    swap(sc, ++lt, i);
                } else if (sc[i] < sc[L]){
                    swap(sc, --gt, i--);
                }
            }
        }
        swap(sc, L, lt--);
        quickSort(sc, freq, L, lt);
        quickSort(sc, freq, gt, R);
    }

    private void swap(char[] sc, int a, int b) {
        char t = sc[a];
        sc[a] = sc[b];
        sc[b] = t;
    }

    public static void main(String[] args) {
        SortCharactersByFrequency sort = new SortCharactersByFrequency();
        System.out.println(sort.frequencySort("loveleetcode"));
    }
}