// LeetCode CN #704
// 題目名稱：二分查找
// 題目連結：https://leetcode.cn/problems/binary-search/
// 題目類型：二分查找 / 簡單

class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int ans = nums[mid];
            if (ans == target) {
                return mid;
            } else if (ans > target) {
                right = right - 1;
            } else {
                left = left + 1;
            }
        }
        return -1;
    }
}