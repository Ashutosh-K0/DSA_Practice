class Solution {
    public int maxSum(int[][] grid) {
        int max = Integer.MIN_VALUE;
        int n = grid.length;
        int m = grid[0].length;
        for (int i = 0; i <= n - 3; i++) {
            for (int j = 0; j <= m - 3; j++) {
                int sum = grid[i][j] + grid[i][j+1] + grid[i][j+2]
                                    + grid[i+1][j+1] +
                          grid[i+2][j] + grid[i+2][j+1] + grid[i+2][j+2];
                max = Math.max(max, sum);
            }
        }
        return max;
    }
}
// LeetCode 2428 - Max Hourglass Sum
// Time Complexity: O(n * m)
// Space Complexity: O(1)
// This code calculates the maximum hourglass sum in a 2D grid.
// An hourglass is defined as a pattern of elements in the grid:
// [a b c]
// [  d  ]
// [e f g]
// The code iterates through all possible hourglass positions in the grid,
// calculates the sum for each hourglass, and keeps track of the maximum sum found.
// The grid must be at least 3x3 in size for an hourglass to exist.
// The function returns the maximum hourglass sum found in the grid.