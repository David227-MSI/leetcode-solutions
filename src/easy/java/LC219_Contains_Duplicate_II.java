// LeetCode CN #219
// 題目名稱：Contains Duplicate II
// 題目連結：https://leetcode.cn/problems/contains-duplicate-ii/
// 題目類型：Array / 難度（簡單）

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // 數值, 索引
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            // 先判斷map裡面是否包含 & 下標距離是否<= k
            if (map.containsKey(x) && i - map.get(x) <= k) {
                return true;
            }
            map.put(x, i);
        }
        return false;
    }
}