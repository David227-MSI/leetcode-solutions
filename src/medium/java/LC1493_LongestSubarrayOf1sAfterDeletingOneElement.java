// LeetCode CN #1493
// 題目名稱：刪掉一個元素以後全為 1 的最長子段
// 題目連結：https://leetcode.cn/problems/longest-subarray-of-1s-after-deleting-one-element/
// 題目類型：滑動窗口 / 中等

class Solution {
    public int longestSubarray(int[] nums) {
        int ans = 0;
        // 計算0的數量
        int cnt0 = 0;
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            // 當righ出現0cnt0 + 1
            cnt0 += 1 - nums[right];
            // 出現兩個0，不符
            while (cnt0 > 1) {
                cnt0 -= 1 - nums[left];
                left++;
            }
            ans = Math.max(ans, right - left);
        }
        return ans;
    }
}