// LeetCode CN #1672
// 題目名稱：Richest Customer Wealth
// 題目連結：https://leetcode.cn/problems/richest-customer-wealth/
// 題目類型：Java / Easy（簡單）

class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;

        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            max = Math.max (sum, max);
        }
        return max;
    }
}