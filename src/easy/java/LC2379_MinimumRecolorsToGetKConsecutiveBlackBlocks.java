// LeetCode CN #2379
// 題目名稱：Minimum Recolors to Get K Consecutive Black Blocks
// 題目連結：https://leetcode.cn/problems/minimum-recolors-to-get-k-consecutive-black-blocks/
// 題目類型：滑動窗口 / 模擬 / 簡單

class Solution {
    public int minimumRecolors(String blocks, int k) {
        char[] block = blocks.toCharArray();
        int count = 0;
        for (int i = 0; i < k; i++) {
            count += block[i] & 1;
        }
        int ans = count;
        for (int i = k; i < block.length; i++) {
            count += (block[i] & 1) - (block[i - k] & 1);
            ans = Math.min(ans, count);
        }
        return ans;
    }
}