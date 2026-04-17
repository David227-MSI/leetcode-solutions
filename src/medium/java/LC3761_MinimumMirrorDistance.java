// LeetCode #3761
// 題目名稱：Minimum Absolute Distance Between Mirror Pairs
// 題目類型：哈希表 / 字串處理 / 中等

class Solution {
    public int minMirrorPairDistance(int[] nums) {
        int minDistance = Integer.MAX_VALUE;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                // 算鏡像對的距離
                minDistance = Math.min(minDistance, i - map.get(nums[i]));
            }
            // 反轉後放入map
            int target = reverse(nums[i]);
            map.put(target, i);

        }
        return minDistance == Integer.MAX_VALUE ? -1 : minDistance;

    }

    private int reverse(int n) {
        int rev = 0;
        while (n != 0) {
            // 取個位數
            int lastDig = n % 10;
            // 將個位數放入將要返回的字段一步一步往前推
            rev = rev * 10 + lastDig;
            // 移除個位數
            n /= 10;
        }
        return rev;
    }

}