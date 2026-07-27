// LeetCode CN #1464
// 題目名稱：陣列中兩元素的最大乘積
// 題目連結：https://leetcode.cn/problems/maximum-product-of-two-elements-in-an-array/
// 題目類型：貪婪演算法 / 一次遍歷 / 簡單

class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1);
    }
}