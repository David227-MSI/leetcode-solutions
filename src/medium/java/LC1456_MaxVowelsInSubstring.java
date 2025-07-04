// LeetCode CN #1456
// 題目名稱：定長子串中元音的最大數目
// 題目連結：https://leetcode.cn/problems/maximum-number-of-vowels-in-a-substring-of-given-length/
// 題目類型：滑動窗口 / 中等

class Solution {
    public int maxVowels(String s, int k) {
        char[] S = s.toCharArray();
        int ans = 0;
        int vowel = 0;
        for (int i = 0; i < S.length; i++) {
            if (S[i] == 'a' || S[i] == 'e' || S[i] == 'i' || S[i] == 'o' || S[i] == 'u') {
                vowel++;
            }
            if (i < k - 1) {
                continue;
            }
            ans = Math.max(ans, vowel);
            char out = S[i - k + 1];
            if (out == 'a' || out == 'e' || out == 'i' || out == 'o' || out == 'u') {
                vowel--;
            }
        }
        return ans;
    }
}