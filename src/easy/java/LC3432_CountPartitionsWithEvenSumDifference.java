// LeetCode CN #3432
// 題目名稱：統計元素和差值為偶數的分區方案
// 題目連結：https://leetcode.cn/problems/count-partitions-with-even-sum-difference/
// 題目類型：數組 / 數學 / 簡單

class Solution {
    public int countPartitions(int[] nums) {
        /** L - R = 偶數 ， L - (S - L) = 2L - S
         *  2L必定為偶數 ，S如是偶數 = ANS
         */
        int sum = Arrays.stream(nums).sum();
        return (sum % 2 != 0) ? 0 : nums.length - 1;
    }
}