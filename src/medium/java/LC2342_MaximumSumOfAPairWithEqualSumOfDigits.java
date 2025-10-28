// LeetCode CN #2342
// 題目名稱：Maximum Sum of a Pair With Equal Sum of Digits
// 題目連結：https://leetcode.cn/problems/maximum-sum-of-a-pair-with-equal-sum-of-digits/
// 題目類型：Array / 中等

class Solution {
    public int maximumSum(int[] nums) {
        int ans = -1;
        int[] temp = new int[82];
        for (int i : nums) {
            int sum = 0;
            // 數位和
            for (int x = i; x > 0; x /= 10) {
                sum += x % 10;
            }
            if (temp[sum] > 0) {
                ans = Math.max(ans, temp[sum] + i);
            }
            temp[sum] = Math.max(temp[sum], i);
        }
        return ans;
    }
}