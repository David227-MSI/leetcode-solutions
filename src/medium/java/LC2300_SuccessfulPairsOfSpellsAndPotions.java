// LeetCode CN #2300
// �D�ئW�١G�G�y�P�Ĥ������\�t��
// �D�سs���Ghttps://leetcode.cn/problems/successful-pairs-of-spells-and-potions/
// �D�������G�G���d�� / ����

class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n = spells.length, m = potions.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int left = 0, right = m - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if ((long) spells[i] * potions[mid] >= success) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            ans[i] = n - left;
        }
        return ans;
    }
}