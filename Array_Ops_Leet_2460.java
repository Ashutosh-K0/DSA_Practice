class Array_Ops_Leet_2460 {
    public int[] applyOperations(int[] nums) {
        int N = nums.length;
        for (int i = 0; i < N - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] = nums[i] * 2;
                nums[i + 1] = 0;
            }
        }
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (nums[i] == 0) count++;
        }
        int[] ze = new int[count];
        int[] arr = new int[N];
        int arrInd = 0, zeInd = 0;
        for (int i = 0; i < N; i++) {
            if (nums[i] == 0) {
                ze[zeInd++] = nums[i];
            } else {
                arr[arrInd++] = nums[i];
            }
        }
        for (int i = 0; i < arrInd; i++) {
            nums[i] = arr[i];
        }
        for (int i = 0; i < count; i++) {
            nums[arrInd + i] = ze[i];
        }

        return nums;
    }
}
