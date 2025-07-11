// LeetCode CN #1652
// 題目名稱：拆炸彈
// 題目連結：https://leetcode.cn/problems/defuse-the-bomb/
// 題目類型：陣列 / 滑動窗口 / 模擬 / 簡單

class Solution {
    public int[] decrypt(int[] code, int k) {
        // 新陣列長度 = 原長度
        int n = code.length;
        int[] ans = new int[n];
        // r = 初次窗口最右側位置
        int r = k > 0 ? k + 1 : n;
        // k = 窗口長度
        k = Math.abs(k);
        int sum = 0;
        // 計算ans[0];
        for (int i = r - k; i < r; i++) {
            sum += code[i];
        }
        for (int i = 0; i < n; i++) {
            ans[i] = sum;
            // + 移入窗口 - 移出窗口
            sum += code[r % n] - code[(r - k) % n];
            r++;
        }
        return ans;
    }
}