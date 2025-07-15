// LeetCode CN #1004
// 題目名稱：最大連續 1 的個數 III
// 題目連結：https://leetcode.cn/problems/max-consecutive-ones-iii/
// 題目類型：滑動視窗 / 中等難度

class Solution {
    public int longestOnes(int[] nums, int k) {
        int ans = 0, left = 0, cnt0 = 0;
        for (int right = 0; right < nums.length; right++) {
            // 進入數字為0才放入
            cnt0 += 1 - nums[right];
            while (cnt0 > k) {
                cnt0 -= 1 - nums[left];
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}
