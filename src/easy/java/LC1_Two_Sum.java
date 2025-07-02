// LeetCode CN #1. Two Sum
// 題目連結：https://leetcode.cn/problems/two-sum/
// 難度：簡單（Easy）

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] a = new int[2];
        for ( int i = 0; i < nums.length; i++) {
            for ( int j = i + 1; j < nums.length ; j++){
                if(target == nums[i] + nums[j]) {
                    a[0] = i;
                    a[1] = j;
                    return a;
                }
            }
        }
        return a;
    }
}