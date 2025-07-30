// LeetCode CN #34
// 題目名稱：在排序數組中查找元素的第一個和最後一個位置
// 題目連結：https://leetcode.cn/problems/find-first-and-last-position-of-element-in-sorted-array/
// 題目類型：二分查找 / 中等

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findBound(nums, target, true);
        int last = findBound(nums, target, false);
        return new int[]{first, last};
    }

    private int findBound(int[] nums, int target, boolean findFirst) {
        int left = 0, right = nums.length - 1, ans = -1;
        // 直到交界處
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                ans = mid;
                // 根據查找類型決定繼續向左或向右搜索
                if (findFirst) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
}