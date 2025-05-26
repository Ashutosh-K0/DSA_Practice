class Leet_3190_Moves_Divby3 {
    /**
     * You are given a 0-indexed integer array nums.
     * In one operation, you can choose an index i and increment nums[i] by 1.
     * Return the minimum number of operations required to make every element in nums divisible by 3.
     *
     * @param nums the input array
     * @return the minimum number of operations
     */
    public int minimumOperations(int[] nums) {
        int count = 0;
        int N = nums.length;
        for(int i=0;i<N;i++){
            if(nums[i]%3!=0){
                count++;
            }
        }
        return count;
    }
}