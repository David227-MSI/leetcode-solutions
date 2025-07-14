// LeetCode CN #2024
// 題目名稱：最大化考試的困惑度
// 題目連結：https://leetcode.cn/problems/maximize-the-confusion-of-an-exam/
// 題目類型：Java / 中等

class Solution {
    String s;
    // 長度, 容錯次數
    int n, K;

    public int maxConsecutiveAnswers(String answerKey, int k) {
        s = answerKey;
        n = answerKey.length();
        K = k;
        return Math.max(getCnt('T'), getCnt('F'));
    }

    int getCnt(char c) {
        int ans = 0;
        for (int i = 0, j = 0, cnt = 0; i < n; i++) {
            if (s.charAt(i) == c) cnt++;
            // 當 cnt 超過 K 時，表示當前視窗不合法，需要縮小視窗
            while (cnt > K) {
                if (s.charAt(j) == c) cnt--;
                j++;
            }
            ans = Math.max(ans, i - j + 1);   // 每次更新當前合法視窗的最大長度
        }
        return ans;
    }
}
