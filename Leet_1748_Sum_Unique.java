class Leet_1748_Sum_Unique {
// LeetCode 1748 - Sum of Unique Elements
    public int sumOfUnique(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int[] count = new int[n];
        for (int i = 0; i < n; i++) {
            int c = 0;
            for (int j =0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    c++;
                }
            }
            count[i] = c;
        }
        for (int i = 0; i < n; i++) {
            if (count[i] == 1) {
                sum += nums[i];
            }
        }

        return sum;
    }
}
// Time Complexity: O(n^2)
// Space Complexity: O(n)
// This solution uses a brute force approach to count the occurrences of each element in the array.
