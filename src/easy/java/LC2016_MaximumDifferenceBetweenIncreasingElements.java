// LeetCode CN #2016
// 題目名稱：遞增元素之間的最大差值
// 題目連結：https://leetcode.cn/problems/maximum-difference-between-increasing-elements/
// 題目類型：陣列 / 簡單

class Solution {
    public int maximumDifference(int[] nums) {
        int ans = 0;
        int minNumber = Integer.MAX_VALUE;
        for (int i : nums) {
            ans = Math.max(ans, i - minNumber);
            minNumber = Math.min(minNumber, i);
        }
        return ans > 0 ? ans : -1;
    }
}