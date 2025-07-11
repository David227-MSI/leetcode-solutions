// LeetCode CN #904
// 題目名稱：水果成籃
// 題目連結：https://leetcode.cn/problems/fruit-into-baskets/
// 題目類型：滑動窗口 / 中等

class Solution {
    public int totalFruit(int[] fruits) {
        int ans = 0, left = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int right = 0; right < fruits.length; right++) {
            map.merge(fruits[right], 1, Integer::sum);
            while (map.size() > 2) {
                int out = fruits[left];
                map.merge(out, -1, Integer::sum);
                if (map.get(out) == 0) {
                    map.remove(out);
                }
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}