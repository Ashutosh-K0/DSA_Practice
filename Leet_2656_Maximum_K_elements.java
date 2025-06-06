class Leet_2656_Maximum_K_elements {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int ans = 0;
        int max = nums[nums.length-1];
        for(int i=0;i<k;i++){
            ans +=max; 
            max += 1;
            
        }
        return ans;
    }
}
