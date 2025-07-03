// LeetCode CN #3304
// 題目名稱：找出字符串中的第 K 個字符
// 題目連結：https://leetcode.cn/problems/find-the-kth-character-of-the-string/
// 題目類型：字串 / 模擬 / Easy

class Solution {
    public char kthCharacter(int k) {
        StringBuilder sb = new StringBuilder("a");
        while (sb.length() < k) {
            int leng = sb.length();
            for (int i = 0; i < leng; i++) {
                sb.append((char) (sb.charAt(i) + 1));
            }
        }
        return sb.charAt(k - 1);
    }
}