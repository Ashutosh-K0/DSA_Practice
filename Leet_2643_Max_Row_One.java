class Leet_2643_Max_Row_One {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int n = mat.length;  
        int m = mat[0].length;     
        int max = 0;               
        int rowIndex = 0;          
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 1) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                rowIndex = i;
            }
        }
        return new int[]{rowIndex, max};
    }
}