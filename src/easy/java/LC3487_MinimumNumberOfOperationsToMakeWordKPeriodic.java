// LeetCode CN #3487
// 題目名稱：Minimum Number of Operations to Make Word K-Periodic
// 題目連結：https://leetcode.cn/problems/minimum-number-of-operations-to-make-word-k-periodic/
// 題目類型：字串 / 中等

class Solution {
    public int maxSum(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            // 計算負數，負數相加會更小，所以只留一個
            if (num < 0) {
                max = Math.max(num, max);
            } else if (set.add(num)) {
                sum += num;
            }
        }
        return set.isEmpty() ? max : sum;
    }
}