// LeetCode CN #2904
// 題目名稱：最短的美麗子字串
// 題目連結：https://leetcode.cn/problems/shortest-beautiful-substring/
// 題目類型：字串 / 難度（中等）

class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        // 特殊判定
        if (s.replace("0", "").length() < k) {
            return "";
        }

        char[] S = s.toCharArray();
        int cnt1 = 0, left = 0;
        String ans = s;

        for (int right = 0; right < S.length; right++) {
            cnt1 += S[right] - '0';
            while (cnt1 > k || S[left] == '0') {
                cnt1 -= S[left] - '0';
                left++;
            }
            if (cnt1 == k) {
                String t = s.substring(left, right + 1);
                if (t.length() < ans.length() || t.length() == ans.length() && t.compareTo(ans) < 0) {
                    ans = t;
                }
            }
        }
        return ans;
    }
}