class Leet_2574_LeftRight_Diff {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] ans = new int[n];
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] + nums[i - 1];
        }
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] + nums[i + 1];
        }
        for (int i = 0; i < n; i++) {
            ans[i] = Math.abs(left[i] - right[i]);
        }
        return ans;
    }
}
// Time: O(n)
// Space: O(n)
// LeetCode: https://leetcode.com/problems/find-the-difference-of-two-arrays/
// Note: This code calculates the absolute difference between the sum of elements to the left and right of each index in the array.
