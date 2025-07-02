// LeetCode CN #263
// 題目名稱：醜數
// 題目連結：https://leetcode.cn/problems/ugly-number/
// 題目類型：Java / 簡單（Easy）

class Solution {
    public boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }
        int[] i = {2, 3, 5};
        for (int a : i) {
            while (n % a ==0) {
                n /= a;
            }
        }
        return n == 1;
    }
}