// LeetCode CN #3494
// 題目名稱：最小完成時間（煉製藥水流水線）
// 題目連結：https://leetcode.cn/problems/find-the-minimum-amount-of-time-to-brew-potions/description/?envType=daily-question&envId=2025-10-09
// 題目類型：Java / 中等

class Solution {
    public long minTime(int[] skill, int[] mana) {
        // 巫師人數
        int n = skill.length;
        // 完成時間
        long[] lastFinish = new long[n];
        for (int m : mana) {
            // 上一人 + 製作時間
            long sum = 0;
            for (int i = 0; i < n; i++) {
                sum = Math.max(sum, lastFinish[i]) + skill[i] * m;
            }
            lastFinish[n - 1] = sum;
            for (int i = n - 2; i >= 0; i--) {
                lastFinish[i] = lastFinish[i + 1] - skill[i + 1] * m;
            }
        }
        return lastFinish[n - 1];
    }
}