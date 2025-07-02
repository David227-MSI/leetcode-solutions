// LeetCode CN #3289
// 題目名稱：The Two Sneaky Numbers of Digitville
// 題目連結：https://leetcode.cn/problems/the-two-sneaky-numbers-of-digitville/
// 題目類型：Java / Easy（簡單）

class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] ans = new int[2];
        int index = 0;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                ans[index] = num;
                index++;
            }
        }
        return ans;
    }
}