// LeetCode CN #3090
// 題目名稱：每个字符最多出现两次的最长子字符串
// 題目連結：https://leetcode.cn/problems/maximum-length-substring-with-two-occurrences/
// 題目類型：滑動窗口 / 簡單

class Solution {
    public int maximumLengthSubstring(String s) {
        int ans = 0;
        int left = 0;
        char[] S = s.toCharArray();
        int n = S.length;
        char[] c = new char[128];
        for (int right = 0; right < n; right++) {
            c[S[right]]++;
            while (c[S[right]] > 2) {
                c[S[left]]--;
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}