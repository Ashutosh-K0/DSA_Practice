class Leet_2149_Rearrange_Sign {
    public int[] rearrangeArray(int[] nums) {
        int[] pos = new int[nums.length / 2];
        int[] neg = new int[nums.length / 2];
        int p = 0, n = 0;
        for (int num : nums) {
            if (num > 0) pos[p++] = num;
            else neg[n++] = num;
        }
        p = 0;
        n = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                nums[i] = pos[p++];
            } else {
                nums[i] = neg[n++];
            }
        }
        return nums;
    }
}
// LeetCode 2149 - Rearrange Array Elements by Sign
// Given an array of integers nums, rearrange the elements of nums such that every even-indexed position is occupied by a positive number and every odd-indexed position is occupied by a negative number.
// Return the rearranged array.
// The input array nums is guaranteed to have an equal number of positive and negative integers.