// LeetCode CN #3354
// 題目名稱：Make Array Elements Equal to Zero
// 題目連結：https://leetcode.cn/problems/make-array-elements-equal-to-zero/
// 題目類型：數組 / 中等

class Solution {
    public int countValidSelections(int[] nums) {
        int n = nums.length;
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        int prefix = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            total -= nums[i];
            prefix += nums[i];
            if (nums[i] == 0) {
                int R = prefix;
                int L = total;
                if (R == L) {
                    ans += 2;
                } else if (Math.abs(R - L) == 1) {
                    ans += 1;
                }
            }
        }
        return ans;
    }
}