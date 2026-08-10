// LeetCode CN #3731
// 題目名稱：找出缺失的元素
// 題目連結：https://leetcode.cn/problems/find-missing-element/
// 題目類型：位元運算 / 陣列 / 簡單

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            min = Math.min(i, min);
            max = Math.max(i, max);
            set.add(i);
        }

        List<Integer> list = new ArrayList<>();
        for (int i = min + 1; i < max; i++) {
            if (!set.contains(i)) {
                list.add(i);
            }
        }
        return list;
    }
}