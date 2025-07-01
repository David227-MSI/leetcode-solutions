// LeetCode CN #1470
// 題目名稱：Shuffle the Array
// 題目連結：https://leetcode.cn/problems/shuffle-the-array/
// 題目類型：Java / Easy（簡單）

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int [2*n];

        for (int i = 0; i < n; i++ ) {
            ans[2*i] = nums[i];
            ans[2*i +1] = nums[i+n];
        }
        return ans;
    }
}