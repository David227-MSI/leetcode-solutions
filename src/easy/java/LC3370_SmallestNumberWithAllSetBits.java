// LeetCode CN #3370
// 題目名稱：最小的由連續 1 組成的數
// 題目連結：https://leetcode.cn/problems/3370/
// 題目類型：位運算 / 中等

class Solution {
    public int smallestNumber(int n) {
        // 利用Integer方法計算 n 的二進位表示需要的位數
        int bitlength = 32 - Integer.numberOfLeadingZeros(n);
        // 回傳最小的 2^k - 1（即 k 個連續的 1），保證 ≥ n
        return (1 << bitlength) - 1;
    }
}