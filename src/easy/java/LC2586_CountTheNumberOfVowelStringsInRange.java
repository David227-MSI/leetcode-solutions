// LeetCode CN #2586
// 題目名稱：計算範圍內的元音字符串數
// 題目連結：https://leetcode.cn/problems/count-the-number-of-vowel-strings-in-range/
// 題目類型：陣列 / 字串 / 模擬 / Easy

class Solution {

    private static final String VOWEL = "aeiou";

    public int vowelStrings(String[] words, int left, int right) {
        int ans = 0;
        for (int i = left; i <= right; i++) {
            if (VOWEL.indexOf(words[i].charAt(0)) != -1 &&
                    VOWEL.indexOf(words[i].charAt(words[i].length() - 1)) != -1)
                ans++;
        }
        return ans;
    }
}