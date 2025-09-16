// LeetCode CN #2197
// 題目名稱：Replace Non-Coprime Numbers in Array
// 題目連結：https://leetcode.cn/problems/replace-non-coprime-numbers-in-array/
// 題目類型：數組 / 數學 / 棧 / 最大公約數
// 難度：困難

class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> st = new ArrayList<>();
        for (int x : nums) {
            /* 當佇列為空將nums陣列中的數字放入，第二輪相鄰數字跟已放入數字做gcb方法，如大於1代表非互質數
               此時替換為最小公倍數，並移除已放入新集合的數字
            */
            while (!st.isEmpty() && gcd(x, st.getLast()) > 1) {
                x = lcm(x, st.removeLast());
            }
            st.add(x);
        }
        return st;
    }

    // 最大公因數
    private int gcd(int a, int b) {
        while (a != 0) {
            int temp = a;
            a = b % a;
            b = temp;
        }
        return b;
    }

    // 算最小公倍數，原a * b / 最大公因數，避免溢出換順序
    private int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }
}