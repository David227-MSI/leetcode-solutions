// LeetCode CN #2996
// 題目名稱：大於等於順序前綴和的最小缺失整數
// 題目連結：https://leetcode.cn/problems/smallest-missing-integer-greater-than-sequential-prefix-sum/
// 題目類型：陣列 / 哈希集合 / 簡單

class Solution {
    public int missingInteger(int[] nums) {
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                sum += nums[i];
            } else {
                break;
            }
        }
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        while (set.contains(sum)) {
            sum++;
        }
        return sum;
    }
}