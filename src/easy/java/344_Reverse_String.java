// LeetCode CN #344. Reverse String
// 題目連結：https://leetcode.cn/problems/reverse-string/
// 難度：簡單（Easy）

class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        for (int left = 0, right = n-1; left < right; left++, right--) {
            char a = s[left];
            s[left] = s[right];
            s[right] = a;
        }
    }
}