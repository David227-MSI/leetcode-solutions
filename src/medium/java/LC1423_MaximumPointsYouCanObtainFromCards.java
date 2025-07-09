// LeetCode CN #1423
// 題目名稱：可獲得的最大點數
// 題目連結：https://leetcode.cn/problems/maximum-points-you-can-obtain-from-cards/
// 題目類型：滑動窗口 / 中等

class Solution {
    public int maxScore(int[] cardPoints, int k) {
        // 陣列長度 - 拿走卡牌 = 剩下卡片
        int n = cardPoints.length;
        int m = n - k;
        int sum = 0;
        // 第一組窗口
        for (int i = 0; i < m; i++) {
            sum += cardPoints[i];
        }
        int total = sum;
        int minS = sum;
        // 從最短(第一組窗口)開始移動
        for (int i = m; i < n; i++) {
            // 總點數
            total += cardPoints[i];
            // 總點數 - 移出窗口卡片
            sum += cardPoints[i] - cardPoints[i - m];
            minS = Math.min(minS, sum);
        }
        // 總點數 - 最小 = 最大
        return total - minS;
    }
}