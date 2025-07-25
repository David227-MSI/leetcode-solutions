// LeetCode CN #1234
// 題目名稱：替換子串以獲得平衡字符串
// 題目連結：https://leetcode.cn/problems/replace-the-substring-for-balanced-string/
// 題目類型：滑動窗口 / 中等

class Solution {
    public int balancedString(String s) {
        char[] S = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        // 統計字元出現次數 (map = 某數 - 次數)
        for (char c : S) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int n = S.length;
        int m = n / 4;

        // 本身就是平衡自符
        if (map.getOrDefault('Q', 0) == m &&
                map.getOrDefault('W', 0) == m &&
                map.getOrDefault('E', 0) == m &&
                map.getOrDefault('R', 0) == m) {
            return 0;
        }

        int ans = n;
        int left = 0;
        for (int right = 0; right < n; right++) {
            map.put(S[right], map.get(S[right]) - 1);

            while (map.getOrDefault('Q', 0) <= m &&
                    map.getOrDefault('W', 0) <= m &&
                    map.getOrDefault('E', 0) <= m &&
                    map.getOrDefault('R', 0) <= m) {
                ans = Math.min(ans, right - left + 1);
                map.put(S[left], map.get(S[left]) + 1);
                left++;
            }
        }
        return ans;
    }
}