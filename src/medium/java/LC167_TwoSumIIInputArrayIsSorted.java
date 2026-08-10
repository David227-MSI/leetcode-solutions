// LeetCode CN #167
// 題目名稱：兩數之和 II - 輸入有序陣列
// 題目連結：https://leetcode.cn/problems/two-sum-ii-input-array-is-sorted/
// 題目類型：雙指針 / 中等

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1};
    }
}