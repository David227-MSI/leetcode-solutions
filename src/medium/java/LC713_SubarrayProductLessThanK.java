// LeetCode CN #713
// 題目名稱：乘積小於 K 的子陣列
// 題目連結：https://leetcode.cn/problems/subarray-product-less-than-k/
// 題目類型：滑動窗口 / 中等

class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) {
            return 0;
        }
        // 窗口右由左開始往右，每一個區間不符則縮小左方窗口
        int ans = 0, prod = 1, left = 0;
        for (int right = 0; right < nums.length; right++) {
            prod *= nums[right];
            while (prod >= k) {
                prod /= nums[left];
                left++;
            }
            ans += right - left + 1;
        }
        return ans;
    }
}