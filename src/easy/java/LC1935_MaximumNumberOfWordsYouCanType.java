// LeetCode CN #1935
// 題目名稱：可以輸入的最大單詞數
// 題目連結：https://leetcode.cn/problems/maximum-number-of-words-you-can-type/
// 題目類型：字符串 / 簡單

class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        String[] brokenLetter = brokenLetters.split("");
        int count = 0;

        for (String word : words) {
            boolean canBeTypedWords = true;
            for (String letter : brokenLetter) {
                if ("".equals(letter)) {
                    continue;
                }
                if (word.contains(letter)) {
                    canBeTypedWords = false;
                    break;
                }
            }
            if (canBeTypedWords) {
                count++;
            }
        }
        return count;
    }
}