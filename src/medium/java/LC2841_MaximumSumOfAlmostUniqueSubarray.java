// LeetCode CN #2841
// 題目名稱：最大和分割
// 題目連結：https://leetcode.cn/problems/maximum-sum-of-almost-unique-subarray/
// 題目類型：滑動窗口 / 中等

class Solution {
    public long maxSum(List<Integer> nums, int m, int k) {
        // 轉陣列
        Integer[] a = nums.toArray(new Integer[0]);
        // 最大和答案
        long ans = 0;
        // 和
        long sum = 0;
        Map<Integer, Integer> count = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            // 沒有則放入，有則對該key的value做+1
            count.merge(a[i], 1, Integer::sum);
            // 窗口最左下標
            int left = i - k + 1;
            if (left < 0) {
                continue;
            }
            // update
            if (count.size() >= m) {
                ans = Math.max(ans, sum);
            }
            // 移除
            int out = a[left];
            sum -= out;
            // 該鍵統計的數量
            int val = count.get(out);
            // 判斷該數於map的數量，> 1 扣除1 ， 只有一個移除
            if (val > 1) {
                count.put(out, val - 1);
            } else {
                count.remove(out);
            }
        }
        return ans;
    }
}