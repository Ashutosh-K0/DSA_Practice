class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (Math.abs(arr[i] - arr[j]) <= a) {
                    for (int k = j + 1; k < arr.length; k++) {
                        if (Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}
// This code defines a method to count the number of good triplets in an array based on given conditions.
// It uses nested loops to check all combinations of triplets and counts those that satisfy the conditions defined by a, b, and c.
// The time complexity is O(n^3) where n is the length of the array, which may not be efficient for large arrays.
// The code can be optimized further, but this implementation is straightforward and easy to understand.
// The method `countGoodTriplets` takes an array of integers and three integers a, b, and c as parameters.
// It returns the count of good triplets that satisfy the conditions based on the absolute differences between the elements of the triplets.
// The code iterates through all possible triplets in the array and checks if they meet the specified conditions.
// The method returns the total count of such triplets found in the array.
