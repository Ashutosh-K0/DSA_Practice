class Move_Zeroes_end{
    public void moveZeroes(int[] nums) {
        int N = nums.length;
        int[] arr = new int[N];
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (nums[i] == 0) {
                count++;
            }
        }
        int[] ze = new int[count];
        int arrIndex = 0;
        int zeIndex = 0;  
        for (int i = 0; i < N; i++) {
            if (nums[i] != 0) {
                arr[arrIndex++] = nums[i];
            } else {
                ze[zeIndex++] = nums[i];
            }
        }
        for (int i = 0; i < arrIndex; i++) {
            nums[i] = arr[i];
        }
        for (int i = 0; i < count; i++) {
            nums[arrIndex + i] = ze[i];
        }
        for (int i = 0; i < N; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
