// LeetCode CN #1679
// 題目名稱：K 和數對的最大數目
// 題目連結：https://leetcode.cn/problems/max-number-of-k-sum-pairs/
// 題目類型：演算法 / 中等

class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for (int n : nums) {
            // 先計算配對的數量
            int c = map.getOrDefault(k - n, 0);
            if (c > 0) {
                // 取出並扣除
                map.put(k - n, c - 1);
                ans++;
            } else {
                // 如無配對將數字放入map
                map.merge(n, 1, Integer::sum);
            }
        }
        return ans;
    }
}