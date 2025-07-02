// LeetCode CN #88
// 題目名稱：Merge Sorted Array
// 題目連結：https://leetcode.cn/problems/merge-sorted-array/
// 題目類型：Java / Easy（簡單）

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
    }
}