class Solution {
    public int[] transformArray(int[] nums) {
        int N = nums.length;
        for(int i=0;i<N;i++){
            if(nums[i]%2==0){
                nums[i]=0;
            }
            else{
                nums[i]=1;
            }
        }
        Arrays.sort(nums);
        return nums;
    }
}