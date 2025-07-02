// LeetCode CN #1207
// 題目名稱：Unique Number of Occurrences
// 題目連結：https://leetcode.cn/problems/unique-number-of-occurrences/
// 題目類型：Java / Easy（簡單）

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for ( int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0)+1);
        }

        Set<Integer> countSet = new HashSet<>(countMap.values());

        return countMap.size() == countSet.size();
    }
}