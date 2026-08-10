// LeetCode CN #3517
// 題目名稱：最小回文排列 I
// 題目連結：https://leetcode.cn/problems/smallest-palindrome-i/
// 題目類型：字串 / 貪心 / 排序 / 中等

class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        int halflen = n / 2;

        char[] halfchar = s.substring(0, halflen).toCharArray();
        Arrays.sort(halfchar);

        String first = new String(halfchar);
        String second = new StringBuilder(first).reverse().toString();

        if (n % 2 == 1) {
            return first + s.charAt(halflen) + second;
        }
        return first + second;
    }
}