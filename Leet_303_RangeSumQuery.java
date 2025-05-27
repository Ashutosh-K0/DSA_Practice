class Leet_303_RangeSumQuery {
    private int[] prefixSums;

    public NumArray(int[] nums) {
        int n = nums.length;
        prefixSums = new int[n + 1]; // prefixSums[0] = 0
        for (int i = 0; i < n; i++) {
            prefixSums[i + 1] = prefixSums[i] + nums[i];
        }
    }
    public int sumRange(int left, int right) {
        return prefixSums[right + 1] - prefixSums[left];
    }
}
