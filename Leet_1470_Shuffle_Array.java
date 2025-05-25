class Leet_1470_Shuffle_Array {
    public int[] shuffle(int[] nums, int n) {
        int N = nums.length;
        int[] arr = new int[N];
        int start = 0;
        int end = n;
        for(int i=0;i<N;i++){
            if(i%2==0){
                arr[i] = nums[start];
                start++;
            }else{
                arr[i] = nums[end];
                end++;
            }
        }
        return arr;
    }
}
// Time Complexity: O(n)
// Space Complexity: O(n)