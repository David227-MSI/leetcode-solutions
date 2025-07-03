// LeetCode CN #1422
// 題目名稱：分割字符串的最大得分
// 題目連結：https://leetcode.cn/problems/maximum-score-after-splitting-a-string/
// 題目類型：字串 / 模擬 / Easy

class Solution {
    public int maxScore(String s) {
        int score = 0;
        if (s.charAt(0) == '0') {
            score++;
        }
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                score++;
            }
        }
        int ans = score;
        for (int i = 1; i < s.length() -1; i++) {
            if (s.charAt(i) == '0') {
                score++;
            } else {
                score--;
            }
            ans = Math.max(ans, score);
        }
        return ans;
    }
}