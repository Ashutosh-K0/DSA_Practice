class Leet_2482_Zeroes_Ones {
    public int[][] onesMinusZeros(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[] onesRow = new int[n];
        int[] zerosRow = new int[n];
        int[] onesCol = new int[m];
        int[] zerosCol = new int[m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    onesRow[i]++;
                    onesCol[j]++;
                } else {
                    zerosRow[i]++;
                    zerosCol[j]++;
                }
            }
        }
        int[][] diff = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                diff[i][j] = onesRow[i] + onesCol[j] - zerosRow[i] - zerosCol[j];
            }
        }
        return diff;
    }
}
// Time Complexity: O(n * m)
// Space Complexity: O(n + m)
// where n is the number of rows and m is the number of columns in the grid.
// This solution iterates through the grid to count ones and zeros in each row and column,
// and then computes the difference for each cell in a second pass.
// The overall complexity is linear with respect to the number of elements in the grid.
// This approach ensures that we efficiently calculate the required values without unnecessary recomputation.
// The solution is optimal for the problem constraints and handles edge cases effectively.
