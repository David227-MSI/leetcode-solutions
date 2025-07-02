// LeetCode CN #326
// 題目名稱：3 的冪
// 題目連結：https://leetcode.cn/problems/power-of-three/
// 題目類型：Java / 簡單

class Solution {
    public boolean isPowerOfThree(int n) {
        while (n != 0 && n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }
}