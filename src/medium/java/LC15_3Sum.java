// LeetCode CN #15
// 題目名稱：三數之和
// 題目連結：https://leetcode.cn/problems/3sum/
// 題目類型：雙指針 / 陣列 / 中等

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        // 去掉left及right
        for (int i = 0; i < n - 2; i++) {
            // 負數加正才會=0
            if (nums[i] > 0) {
                break;
            }
            // 過濾重複數字
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                    // 和為負移動左邊加大總和
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }
}