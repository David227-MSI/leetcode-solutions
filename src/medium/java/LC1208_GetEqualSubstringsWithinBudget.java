// LeetCode CN #1208
// 題目名稱：盡可能使字符串相等
// 題目連結：https://leetcode.cn/problems/get-equal-substrings-within-budget/
// 題目類型：滑動窗口 / 中等

//class Solution {
//    public int equalSubstring(String s, String t, int maxCost) {
//        int left = 0, ans = 0, cost = 0;
//        for (int right = 0; right < s.length(); right++) {
//            cost += Math.abs(s.charAt(right) - t.charAt(right));
//            while (cost > maxCost) {
//                cost -= Math.abs(s.charAt(left) - t.charAt(left));
//                left++;
//            }
//            ans = Math.max(ans, right - left + 1);
//        }
//        return ans;
//    }
//}

/*當處理字串時：

只讀取，不修改 → 建議轉成 char[]

頻繁存取時，避免每次都呼叫 charAt()*/

class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int left = 0, ans = 0, cost = 0;
        char[] S = s.toCharArray();
        char[] T = t.toCharArray();
        for (int right = 0; right < S.length; right++) {
            cost += Math.abs(S[right] - T[right]);
            while (cost > maxCost) {
                cost -= Math.abs(S[left] - T[left]);
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}