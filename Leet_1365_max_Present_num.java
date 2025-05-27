class Leet_1365_max_Present_num {
    /**
     * Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
     * That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
     * Return the answer in an array.
     *
     * Example:
     * Input: nums = [8,1,2,2,3]
     * Output: [4,0,1,1,3]
     */
    public int[] smallerNumbersThanCurrent(int[] nums) {
       int count;
       int n = nums.length;
       int[] arr = new int[n];
       for(int i=0;i<n;i++){
        count = 0;
        for(int j=0;j<n;j++){
            if(nums[i]>nums[j]){
                count++;
            }
        }
        arr[i] = count;
       }
       return arr;
    }
}
// Time Complexity: O(n^2) where n is the length of the input array nums.
// Space Complexity: O(n) for the output array arr.