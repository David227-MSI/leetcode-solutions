// LeetCode CN #2974
// 題目名稱：Minimum Number Game
// 題目連結：https://leetcode.cn/problems/minimum-number-game/
// 題目類型：Java / Easy（簡單）

class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i+=2) {
            int temp = nums[i];
            nums[i] = nums[i+1];
            nums[i+1] = temp;
        }
        return nums;
    }
}