// LeetCode CN #3100
// 題目名稱：換水問題 II（Water Bottles II）
// 題目連結：https://leetcode.cn/problems/water-bottles-ii/
// 題目類型：模擬 / 貪心 / 難度：中等

class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int ans = 0;
        while (numBottles >= numExchange) {
            ans += numExchange;
            numBottles -= numExchange - 1;
            numExchange++;
        }
        return ans + numBottles;
    }
}