// LeetCode CN #424
// 題目名稱：替換後的最長重複字符
// 題目連結：https://leetcode.cn/problems/longest-repeating-character-replacement/
// 題目類型：雙指針 / 滑動窗口 / 中等

class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];

        int left = 0;
        int maxCount = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            // 下標0開始
            count[rightChar - 'A']++;

            // 計算最長字元
            maxCount = Math.max(maxCount, count[rightChar - 'A']);

            while ((right - left + 1) - maxCount > k) {
                // 超過長度限制 左指針向右移動
                char leftChar = s.charAt(left);
                left++;
                count[leftChar - 'A']--;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}