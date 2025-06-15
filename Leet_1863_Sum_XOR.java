class Solution {
    public int subsetXORSum(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int mask = 0; mask < (1 << n); mask++) {
            int xor = 0;
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    xor ^= nums[i];
                }
            }
            sum += xor;
        }

        return sum;
    }
}
// Time Complexity: O(2^n * n), where n is the length of nums
// Space Complexity: O(1), since we are using a constant amount of space for variables
// Note: This solution generates all subsets and calculates their XOR, which is not efficient for large n.