// LeetCode CN #1658
// 題目名稱：將 x 減到 0 的最小操作數
// 題目連結：https://leetcode.cn/problems/minimum-operations-to-reduce-x-to-zero/
// 題目類型：滑動視窗 / 中等難度

class Solution {
    public int minOperations(int[] nums, int x) {
        // 目標 = 中間留下的數字 = 總和 - x
        int target = -x;
        for (int num : nums) {
            // 總和 + target(-x)
            target += num;
        }
        // 全部移除=> < 0
        if (target < 0) {
            return -1;
        }
        // 條件為 target = x 符合 ， ans預設不符合 = -1
        int n = nums.length, left = 0, sum = 0, ans = -1;
        for (int right = 0; right < n; right++) {
            sum += nums[right];
            while (sum > target) {
                sum -= nums[left];
                left++;
            }
            if (sum == target) {
                ans = Math.max(ans, right - left + 1);
            }
        }
        // 不符合條件返回-1 & 原長扣掉中間長度
        return ans < 0 ? -1 : n - ans;
    }
}