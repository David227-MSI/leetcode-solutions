// LeetCode CN #3720
// 題目名稱：大於目標值的字典序最小排列 (Lexicographically Smallest Permutation Greater Than Target)
// 題目連結：https://leetcode.cn/problems/lexicographically-smallest-permutation-greater-than-target/
// 題目類型：字串 / 貪心 / 計數 / 中等

class Solution {
    public String lexGreaterPermutation(String s, String target) {
        int n = s.length();
        int[] count = new int[26];

        for (int i = 0; i < n; i++) {
            count[s.charAt(i) - 'a']++;
        }

        // 相同字串到達下標位置
        int maxMatch = 0;
        while (maxMatch < n && count[target.charAt(maxMatch) - 'a'] > 0) {
            // 移除手牌庫存，並將下標往右至
            count[target.charAt(maxMatch) - 'a']--;
            maxMatch++;
        }

        // 記錄當下長度
        int matched = maxMatch;

        for (int k = Math.min(maxMatch, n - 1); k >= 0; k--) {
            while (matched > k) {
                matched--;
                count[target.charAt(matched) - 'a']++;
            }

            int targetCharIndex = target.charAt(k) - 'a';
            int choose = -1;

            // 依照英文字母對應的座標，找出最大的可能性
            for (int ch = targetCharIndex + 1; ch < 26; ch++) {
                if (count[ch] > 0) {
                    choose = ch;
                    // 找到後結束
                    break;
                }
            }

            if (choose != -1) {
                StringBuilder sb = new StringBuilder();
                sb.append(target, 0, k);
                sb.append((char) ('a' + choose));
                count[choose]--;

                for (int ch = 0; ch < 26; ch++) {
                    while (count[ch] > 0) {
                        sb.append((char) ('a' + ch));
                        count[ch]--;
                    }
                }
                return sb.toString();
            }

        }
        return "";
    }
}