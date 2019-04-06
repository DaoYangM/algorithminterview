package top.daoyang.slidingwindow;

public class MinimunSizeSubarraySum {
    public int minSubArrayLen(int s, int[] nums) {
        int L = 0, R = -1;
        int sum = 0;
        int minLength = nums.length + 1;

        while (L < nums.length) {
            if (R < nums.length - 1 && sum < s) {
                sum += nums[++R];
            } else {
                sum -= nums[L++];
            }

            if (sum >= s) {
                minLength = Math.min(minLength, R - L + 1);
            }
        }

        if (minLength == nums.length + 1)
            return 0;
        return minLength;
    }
}