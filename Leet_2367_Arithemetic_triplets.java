class Leet_2367_Arithemetic_triplets {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=i+2;k<nums.length;k++){
                    if(nums[j] - nums[i]==diff && nums[k]-nums[j]==diff){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
// Time Complexity: O(n^3)
// Space Complexity: O(1)
// The code counts the number of arithmetic triplets in the array `nums` with a given difference `diff`.
// It uses three nested loops to check all combinations of triplets in the array.
// The outer loop iterates through the first element of the triplet, the middle loop through the second, and the innermost loop through the third.
// If the difference between the first and second elements equals `diff` and the difference between the second and third elements also equals `diff`, it increments the count.
// The function returns the total count of such triplets found in the array.
// Note: This solution is not optimal for large arrays due to its O(n^3) time complexity.
// A more efficient solution would involve using a set to track the elements and check for the required conditions in O(n) time.