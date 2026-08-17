// LeetCode CN #567
// 題目名稱：字串的排列
// 題目連結：https://leetcode.cn/problems/permutation-in-string/
// 題目類型：雙指針 / 滑動窗口 / 中等

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        if (n > m) {
            return false;
        }

        int[] cnt = new int[26];
        int[] cnt2 = new int[26];

        for (int i = 0; i < n; i++) {
            cnt[s1.charAt(i) - 'a']++;
            cnt2[s2.charAt(i) - 'a']++;
        }

        if (Arrays.equals(cnt, cnt2)) {
            return true;
        }

        for (int i = n; i < m; i++) {
            cnt2[s2.charAt(i) - 'a']++;
            cnt2[s2.charAt(i - n) - 'a']--;

            if (Arrays.equals(cnt, cnt2)) {
                return true;
            }
        }
        return false;
    }
}