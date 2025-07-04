// LeetCode CN #643
// 題目名稱：子數組最大平均數 I
// 題目連結：https://leetcode.cn/problems/maximum-average-subarray-i/
// 題目類型：滑動窗口 / 簡單

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int maxSum = sum;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, sum);
        }
        return (double)maxSum / k;
    }
}