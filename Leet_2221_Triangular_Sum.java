class Leet_2221_Triangular_Sum {
    /**
     * Given an array of integers nums, we need to calculate the triangular sum.
     * The triangular sum is computed by repeatedly replacing the array with a new array formed by the sum of adjacent elements modulo 10,
     * until only one element remains.
     *
     * @param nums the input array of integers
     * @return the triangular sum as an integer
     */
    public int triangularSum(int[] nums) {
        int n = nums.length;
        while (n > 1) {
            for (int i = 0; i < n - 1; i++) {
                nums[i] = (nums[i] + nums[i + 1]) % 10;
            }
            n--;
        }
        return nums[0];
    }
}