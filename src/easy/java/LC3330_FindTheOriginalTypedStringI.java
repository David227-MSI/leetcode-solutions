// LeetCode CN #3330
// 題目名稱：Find the Original Typed String I
// 題目連結：https://leetcode.cn/problems/find-the-original-typed-string-i/
// 題目類型：Java / 簡單（Easy）

class Solution {
    public int possibleStringCount(String word) {
        int a = 1;
        for ( int i = 0 ; i < word.length()-1 ; i++ ) {
            if( word.charAt(i) == word.charAt(i+1) ) {
                a++;
            }
        }
        return a;
    }
}