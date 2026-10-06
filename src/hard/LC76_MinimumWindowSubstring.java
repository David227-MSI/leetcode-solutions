// LeetCode CN #76
// 題目名稱：最小覆蓋子串
// 題目連結：https://leetcode.cn/problems/minimum-window-substring/
// 題目類型：字串 / 滑動窗口 / 雙指針 / 困難

class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) {
            return "";
        }

        int[] need = new int[128];
        // 字串t中相異字元種類數
        int needCount = 0;
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (need[c] == 0) {
                needCount++;
            }
            need[c]++;
        }

        int[] window = new int[128];

        int left = 0;
        // 視窗內數量已達標字元種類數
        int valid = 0;
        // 起始索引
        int start = 0;
        // 最小覆蓋子串的長度
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            // 進入視窗字元屬於t
            if (need[c] > 0) {
                window[c]++;
                // 當某字元數量相等時
                if (window[c] == need[c]) {
                    valid++;
                }
            }

            // 當位於s字串上視窗已涵蓋所有t時
            while (needCount == valid) {
                // 更新最短
                if (right - left + 1 < minLength) {
                    start = left;
                    minLength = right - left + 1;
                }
                // 收縮左邊界
                char d = s.charAt(left);
                left++;
                // 依照離開視窗字元
                if (need[d] > 0) {
                    // 是否屬於t字串
                    if (window[d] == need[d]) {
                        valid--;
                    }
                    window[d]--;
                }
            }
        }
        return minLength == Integer.MAX_VALUE ? "" : s.substring(start, start + minLength);
    }
}