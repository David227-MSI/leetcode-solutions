// LeetCode CN #2090
// 題目名稱：範圍求和 II
// 題目連結：https://leetcode.cn/problems/k-radius-subarray-averages/
// 題目類型：數組 / 中等

class Solution {
    public int[] getAverages(int[] nums, int k) {
        int l = 2 * k + 1;
        int n = nums.length;
        long sum = 0;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        for(int i = 0; i < n; i++) {
            sum += nums[i];
            if (i < 2 * k) {
                continue;
            }
            ans[i - k] = (int) (sum / l);
            sum -= nums[i-2*k];
        }
        return ans;
    }
}