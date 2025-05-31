class Leet_2778_Square_Special {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                int val = nums[i - 1];
                sum += val * val;
            }
        }

        return sum;
    }
}
