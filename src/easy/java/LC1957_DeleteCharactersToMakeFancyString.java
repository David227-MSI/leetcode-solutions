// LeetCode CN #1957
// 題目名稱：刪除字符使字符串變好
// 題目連結：https://leetcode.cn/problems/delete-characters-to-make-fancy-string/
// 題目類型：字串 / 簡單

class Solution {
    public String makeFancyString(String s) {
        StringBuilder ans = new StringBuilder();
        int cnt = 0;
        // 遍歷次數在3以前放入新的StringBuilder
        for (int i = 0; i < s.length(); i++) {
            cnt++;
            if (cnt < 3) {
                ans.append(s.charAt(i));
            }
            // 下一個字不同重置計數器，不算最後一個字母
            if (i < s.length() - 1 && s.charAt(i) != s.charAt(i + 1)) {
                cnt = 0;
            }
        }
        return ans.toString();
    }
}