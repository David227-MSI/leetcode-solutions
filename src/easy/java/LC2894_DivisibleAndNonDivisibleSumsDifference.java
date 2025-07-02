// LeetCode CN #2894
// 題目名稱：Divisible and Non-divisible Sums Difference
// 題目連結：https://leetcode.cn/problems/divisible-and-non-divisible-sums-difference/
// 題目類型：SQL / Easy（簡單）

class Solution {
    public int differenceOfSums(int n, int m) {
        int num1 = 0;
        int num2 = 0;
        for ( int i = 1; i <= n; i++) {
            if ( i % m !=0) {
                num1 += i;
            } else if (i % m == 0) {
                num2 += i;
            }
        }
        return num1 - num2;
    }
}