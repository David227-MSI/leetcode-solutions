// LeetCode CN #128
// 題目名稱：最長連續序列
// 題目連結：https://leetcode.cn/problems/longest-consecutive-sequence/
// 題目類型：哈希表 / 陣列 / 中等

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;
        for (int n : set) {
            // 檢查是否左邊有數字，比如已經遍歷過1，當開始2左邊有1會導致重複動作
            if (!set.contains(n - 1)) {
                int cur = n;
                int curLength = 1;
                // 檢查右邊是否有順序數字
                while (set.contains(cur + 1)) {
                    cur++;
                    curLength++;
                }
                longest = Math.max(longest, curLength);
            }
        }
        return longest;
    }
}