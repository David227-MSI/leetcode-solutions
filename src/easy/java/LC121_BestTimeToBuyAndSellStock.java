// LeetCode CN #121
// 題目名稱：買賣股票的最佳時機
// 題目連結：https://leetcode.cn/problems/best-time-to-buy-and-sell-stock/
// 題目類型：陣列 / 簡單

class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int minPrice = prices[0];
        for (int i : prices) {
            ans = Math.max(ans, i - minPrice);
            minPrice = Math.min(i, minPrice);
        }
        return ans;
    }
}