// LeetCode CN #3136
// 題目名稱：驗證單詞
// 題目連結：https://leetcode.cn/problems/check-if-a-word-is-valid/
// 題目類型：字串處理 / 簡單難度

class Solution {
    public boolean isValid(String word) {
        // 判斷長度
        if (word.length() < 3) {
            return false;
        }
        // b[0] 放輔音, b[1] 放元音
        boolean[] b = new boolean[2];
        for (char c : word.toCharArray()) {
            // 判斷是否為字母
            if (Character.isAlphabetic(c)) {
                // 轉小寫，Character類方法
                c = Character.toLowerCase(c);
                b[c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ? 1 : 0] = true;
                // 判斷是否為數字
            } else if (!Character.isDigit(c)) {
                return false;
            }
        }
        // b[0], b[1] (元音, 輔音) 需都包含
        return b[0] && b[1];
    }
}