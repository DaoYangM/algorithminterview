package top.daoyang.slidingwindow;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int a = 0, b = -1;
        int[] freq = new int[256];
        int maxLength = 0;

        while (a < s.length()) {
            if (b + 1 < s.length() && freq[s.charAt(b + 1)] == 0) {
                freq[s.charAt(++b)]++;
            } else {
                freq[s.charAt(a++)]--;
            }
            maxLength = Math.max(maxLength, b - a + 1);
        }
        
        return maxLength;
    }
}