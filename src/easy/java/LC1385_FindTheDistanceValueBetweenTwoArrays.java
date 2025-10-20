// LeetCode CN #1385
// 題目名稱：Find the Distance Value Between Two Arrays
// 題目連結：https://leetcode.cn/problems/find-the-distance-value-between-two-arrays/
// 題目類型：Java / 簡單

class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int ans = 0;
        for (int num : arr1) {
            int low = num - d;
            int high = num + d;
            if (!binarySearch(arr2, low, high)) {
                ans++;
            }
        }
        return ans;
    }

    public static boolean binarySearch(int[] arr, int low, int high) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] >= low && arr[mid] <= high) {
                return true;
            } else if (arr[mid] < low) {
                left = mid + 1;
            } else if (arr[mid] > high) {
                right = mid - 1;
            }
        }
        return false;
    }
}