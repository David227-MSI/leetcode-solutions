// LeetCode CN #1512
// 題目名稱：好數對的數目
// 題目連結：https://leetcode.cn/problems/number-of-good-pairs/
// 題目類型：Array / 難度（簡單）
// 解題思路：
// 使用雙重迴圈，逐一比較每一對 (i, j)，若 nums[i] == nums[j] 且 i < j，則為好數對。

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int ans = 0;
        for ( int i = 0 ; i < nums.length ; i++) {
            for ( int j = 0 ; j < i ; j++ ) {
                if ( nums[i] == nums[j] ) {
                    ans++;
                }
            }
        }
        return ans;
    }
}

