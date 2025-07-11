// LeetCode CN #3
// 題目名稱：無重複字元的最長子串
// 題目連結：https://leetcode.cn/problems/longest-substring-without-repeating-characters/
// 題目類型：滑動窗口 / 中等

class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] cs = s.toCharArray();
        int n = cs.length;
        // 設定左邊界
        int left = 0;
        int ans = 0;
        // 建立判斷重複用陣列
        int[] p = new int[128];
        // 取出字元塞入判斷用陣列
        for (int right = 0; right < n; right++) {
            char c = cs[right];
            p[c]++;
            // 持續從左邊界移除直到沒有重複
            while (p[c] > 1) {
                p[cs[left]]--;
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}