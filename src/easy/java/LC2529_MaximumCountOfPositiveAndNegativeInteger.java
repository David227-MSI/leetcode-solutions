// LeetCode CN #2529
// 題目名稱：正整数和负整数的最大计数
// 題目連結：https://leetcode.cn/problems/maximum-count-of-positive-integer-and-negative-integer/
// 題目類型：二分查找 / 簡單

class Solution {
    public int maximumCount(int[] nums) {
        return Math.max(lowerBound(nums, 0), nums.length - lowerBound(nums, 1));
    }

    private int lowerBound(int[] nums, int target) {
        // 初始化
        int left = 0, right = nums.length - 1, ans = 0;
        // while
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}