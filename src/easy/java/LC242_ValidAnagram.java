// LeetCode CN #242
// 題目名稱：有效的字母異位詞
// 題目連結：https://leetcode.cn/problems/valid-anagram/
// 題目類型：哈希表 / 排序 / 簡單

class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        Arrays.sort(sChar);
        Arrays.sort(tChar);

        return Arrays.equals(sChar, tChar);
    }
}