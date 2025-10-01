// LeetCode CN #1518
// 題目名稱：換酒問題 (Water Bottles)
// 題目連結：https://leetcode.cn/problems/water-bottles/
// 題目類型：數學 / 模擬（簡單）

class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = 0;
        while (numBottles >= numExchange) {
            ans += numExchange;
            numBottles -= numExchange - 1;
        }
        return ans + numBottles;
    }
}