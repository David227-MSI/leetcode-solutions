// LeetCode CN #1486
// 題目名稱：數組異或操作（XOR Operation in an Array）
// 題目連結：https://leetcode.cn/problems/xor-operation-in-an-array/
// 題目類型：位元運算 / 簡單

class Solution {
    public int xorOperation(int n, int start) {
        int ans = 0;
        for ( int i = 0; i < n; i++ ) {
            ans ^= start + 2 * i;
        }
        return ans;
    }
}