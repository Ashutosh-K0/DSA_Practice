class Leet_905_Sort_Array_Parity {
    public int[] sortArrayByParity(int[] nums) {
        int even = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                even++;
            }
        }

        int[] eve = new int[even];
        int[] od = new int[nums.length - even];

        int eveInd = 0, odInd = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                eve[eveInd++] = nums[i];
            } else {
                od[odInd++] = nums[i];
            }
        }
        for (int i = 0; i < eve.length; i++) {
            nums[i] = eve[i];
        }
        for (int i = 0; i < od.length; i++) {
            nums[i + even] = od[i];
        }
        return nums;
    }
}
// Time Complexity: O(n)
// Space Complexity: O(n)
// LeetCode: https://leetcode.com/problems/sort-array-by-parity/