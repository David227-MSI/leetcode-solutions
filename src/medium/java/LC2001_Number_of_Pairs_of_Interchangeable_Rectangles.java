// LeetCode CN #2001
// 題目名稱：可互換矩形的組數
// 題目連結：https://leetcode.cn/problems/number-of-pairs-of-interchangeable-rectangles/
// 題目類型：數組 / 中等

class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        long ans = 0;
        Map<String, Integer> map = new HashMap<>();
        for (int[] rectangle : rectangles) {
            int w = rectangle[0], h = rectangle[1];
            int g = gbc(w, h);
            String key = w / g + "/" + h / g;
            ans += map.getOrDefault(key, 0);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        return ans;
    }

    private int gbc(int a, int b) {
        return b == 0 ? a : gbc(b, a % b);
    }
}