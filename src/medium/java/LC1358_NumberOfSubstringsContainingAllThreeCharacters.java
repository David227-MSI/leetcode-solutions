// LeetCode CN #1358
// 題目名稱：包含所有三個字符的子字符串數目
// 題目連結：https://leetcode.cn/problems/number-of-substrings-containing-all-three-characters/
// 題目類型：滑動窗口 / 中等

class Solution {
    public int numberOfSubstrings(String s) {
        int ans = 0;
        // cnt[0] = 'a' 的數量, cnt[1] = 'b', cnt[2] = 'c'
        int[] cnt = new int[3];
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            cnt[s.charAt(right) - 'a']++;
            /*
            當 a、b、c 都至少出現一次，表示目前是合法子字串
            所以有 s.length() - right 個合法子字串。
            */
            while (cnt[0] > 0 && cnt[1] > 0 && cnt[2] > 0) {
                ans += s.length() - right;
                // 移動左指針，縮小視窗，並更新對應字元的計數
                cnt[s.charAt(left) - 'a']--;
                left++;
            }
        }
        return ans;
    }
}