// LeetCode CN #1010
// 題目名稱：總持續時間可被 60 整除的歌曲對
// 題目連結：https://leetcode.cn/problems/pairs-of-songs-with-total-durations-divisible-by-60/
// 題目類型：陣列 / 哈希表 / 計數 / 中等

class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int ans = 0;
        int[] cnt = new int[60];
        for (int i : time) {
            /**
             * cnt陣列最大cnt[59] 所以多%60 避免越界
             * 進行配對，比如20需要配對40， 由於cnt[40]還未被放入因此ans + cnt[40]還是維持0
             * 等到cnt[40]++ ，此時ans再次找到cnt[40]會讓ans數量+1
             */
            ans += cnt[(60 - (i % 60)) % 60];
            // 將數字放入陣列下標位置
            cnt[i % 60]++;
        }
        return ans;
    }
}