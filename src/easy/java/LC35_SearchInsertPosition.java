// LeetCode CN #35
// 題目名稱：搜索插入位置
// 題目連結：https://leetcode.cn/problems/search-insert-position/
// 題目類型：二分查找 / 簡單

class Solution {
    public int searchInsert(int[] nums, int target) {
        return lowerBound(nums, target);
    }

    private int lowerBound(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
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