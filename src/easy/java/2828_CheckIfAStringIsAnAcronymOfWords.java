// LeetCode CN #2828
// 題目名稱：Check if a String Is an Acronym of Words
// 題目連結：https://leetcode.cn/problems/check-if-a-string-is-an-acronym-of-words/
// 題目類型：Java / Easy（簡單）

class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String wor = words.stream()
                .map(e -> String.valueOf(e.charAt(0)))
                .collect(Collectors.joining());
        return  s.equals(wor);
    }
}