// LeetCode CN #1128
// 題目名稱：Number of Equivalent Domino Pairs
// 題目連結：https://leetcode.cn/problems/number-of-equivalent-domino-pairs/
// 題目類型：陣列 / 中等

class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int ans = 0;
        // 題目限制
        int[][] cnt = new int[10][10];
        // 將參數拆成一元陣列
        for (int[] i : dominoes) {
            // 由於dominoes[1][2]和dominoes[2][1]是等同的，所以取最小值
            int a = Math.min(i[0], i[1]);
            int b = Math.max(i[0], i[1]);
            // 利用後置++作統計數量
            ans += cnt[a][b]++;
        }
        return ans;
    }
}