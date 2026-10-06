// LeetCode CN #921
// 題目名稱：使括號有效的最少添加
// 題目連結：https://leetcode.cn/problems/minimum-add-to-make-parentheses-valid/
// 題目類型：棧、貪心 / 中等

class Solution {
    public int minAddToMakeValid(String s) {
        int needLeft = 0;
        int needRight = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                needRight++;
            } else {
                if (needRight > 0) {
                    needRight--;
                } else {
                    needLeft++;
                }
            }
        }
        return needLeft + needRight;
    }
}