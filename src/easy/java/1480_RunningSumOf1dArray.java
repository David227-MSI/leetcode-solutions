// LeetCode CN #1480
// 題目名稱：Running Sum of 1d Array
// 題目連結：https://leetcode.cn/problems/running-sum-of-1d-array/
// 題目類型：Array / Prefix Sum / Easy（簡單）

class Solution {
    public int[] runningSum(int[] nums) {
        int x = 0;
        int[] a = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            x += nums[i];
            a[i] = x;
        }
        return a;
    }
}