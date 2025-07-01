// LeetCode CN #3146
// 題目名稱：Permutation Difference between Two Strings
// 題目連結：https://leetcode.cn/problems/permutation-difference-between-two-strings/
// 題目類型：Java / Easy（簡單）

class Solution {
    public int findPermutationDifference(String s, String t) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            int temp = t.indexOf(s.charAt(i));
            ans += Math.abs(temp - i);
        }
        return ans;
    }
}