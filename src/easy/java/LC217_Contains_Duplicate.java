// LeetCode CN #217
// 題目名稱：存在重複元素
// 題目連結：https://leetcode.cn/problems/contains-duplicate/
// 題目類型：哈希表 / 簡單

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            } else {
                set.add(num);
            }
        }
        return false;
    }
}