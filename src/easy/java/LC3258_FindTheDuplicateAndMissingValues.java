// LeetCode CN #3258
// 題目名稱：找出缺失和重複的數
// 題目連結：https://leetcode.cn/problems/find-the-duplicate-and-missing-values/
// 題目類型：數組 / 模擬 / 數學（簡單）

class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        char[] ch = s.toCharArray();
        int ans = 0, left = 0;
        // 設置計算0跟1的陣列
        int[] cnt = new int[2];
        for (int right = 0; right < ch.length; right++) {
            // ch陣列與1對比，如是1，cnt[1]++ ，0則 cnt[0]++
            cnt[ch[right] & 1]++;
            // 當不符合條件減少統計數量，條件為兩項則一，所以取兩項都不符合才做運算
            while (cnt[0] > k && cnt[1] > k) {
                cnt[ch[left] & 1]--;
                left++;
            }
            ans += right - left + 1;
        }
        return ans;
    }
}