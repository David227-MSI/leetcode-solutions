// LeetCode CN #717
// 題目名稱：1 比特與2 比特字符
// 題目連結：https://leetcode.cn/problems/1-bit-and-2-bit-characters/
// 題目類型：陣列 / 簡單

class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int n = bits.length;
        int i = 0;
        // 轉換只能是 0, 10, 11 ， 注意 1 不行 ， 所以不是 0 就把 i 加 2
        while (i < n - 1) {
            if (bits[i] == 0) {
                i++;
            } else {
                i += 2;
            }
        }
        // i == n - 1 表示最後一個是 0
        return i == n - 1;
    }
}