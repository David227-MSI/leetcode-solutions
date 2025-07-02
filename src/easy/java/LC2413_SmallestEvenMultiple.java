// LeetCode CN #2413
// 題目名稱：Smallest Even Multiple
// 題目連結：https://leetcode.cn/problems/smallest-even-multiple/
// 題目類型：Java / 簡單

class Solution {
    public int smallestEvenMultiple(int n) {
        return n % 2 == 0 ? n : n * 2 ;
    }
}