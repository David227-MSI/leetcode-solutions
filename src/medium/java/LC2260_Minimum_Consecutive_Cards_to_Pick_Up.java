// LeetCode CN #2260
// 題目名稱：Minimum Consecutive Cards to Pick Up
// 題目連結：https://leetcode.cn/problems/minimum-consecutive-cards-to-pick-up/
// 題目類型：Array / 難度（中等）

class Solution {
    public int minimumCardPickup(int[] cards) {
        int ans = Integer.MAX_VALUE;
        // 數值, 下標
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < cards.length; i++) {
            // 判斷map有無
            if (map.containsKey(cards[i])) {
                // 更新最小距離
                ans = Math.min(ans, i - map.get(cards[i]) + 1);
            }
            map.put(cards[i], i);
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}