class Leet_3065_MinOpsTo_Remove {
    /**
     * Given an integer array nums and an integer k, return the minimum number of operations required to remove all elements from nums such that every remaining element is less than k.
     * In one operation, you can remove any element from nums.
     *
     * Example 1:
     * Input: nums = [3,1,2,4], k = 3
     * Output: 2
     * Explanation: We can remove the elements 3 and 4 in two operations. The remaining elements are 1 and 2 which are both less than k.
     *
     * Example 2:
     * Input: nums = [5,6,7], k = 4
     * Output: 3
     * Explanation: All elements are greater than or equal to k. We need to remove all of them in three operations.
     *
     * Constraints:
     * 1 <= nums.length <= 1000
     * 1 <= nums[i] <= 1000
     * 1 <= k <= 1000
     */
    public int minOperations(int[] nums, int k) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=k){
                count++;
            }
        }
        return nums.length - count;
    }
}