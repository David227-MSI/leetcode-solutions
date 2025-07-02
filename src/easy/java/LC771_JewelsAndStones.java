// LeetCode CN #771
// 題目名稱：Jewels and Stones
// 題目連結：https://leetcode.cn/problems/jewels-and-stones/
// 題目類型：Java / Easy（簡單）

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for ( int i = 0; i < jewels.length(); i++) {
            for ( int j = 0; j < stones.length(); j++ ){
                if ( stones.charAt(j) == jewels.charAt(i)) {
                    count++;
                }
            }
        }
        return count;
    }
}