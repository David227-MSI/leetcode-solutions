// LeetCode CN #231
// 題目名稱：2 的冪
// 題目連結：https://leetcode.cn/problems/power-of-two/
// 題目類型：Java / 簡單

class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n-1)) ==0;
    }
}