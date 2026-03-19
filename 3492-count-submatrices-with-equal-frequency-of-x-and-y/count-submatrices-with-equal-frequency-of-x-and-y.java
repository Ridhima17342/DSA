class Solution {
    public int numberOfSubmatrices(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] sum = new int[n][m];
        int[][] countX = new int[n][m]; 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 'X') {
                    sum[i][j] = 1;
                    countX[i][j] = 1;
                } else if (grid[i][j] == 'Y') {
                    sum[i][j] = -1;
                } else {
                    sum[i][j] = 0;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

               if (i > 0) {
                    sum[i][j] += sum[i - 1][j];
                    countX[i][j] += countX[i - 1][j];
                }
                if (j > 0) {
                    sum[i][j] += sum[i][j - 1];
                    countX[i][j] += countX[i][j - 1];
                }
                if (i > 0 && j > 0) {
                    sum[i][j] -= sum[i - 1][j - 1];
                    countX[i][j] -= countX[i - 1][j - 1];
                }
                if (sum[i][j] == 0 && countX[i][j] > 0) {
                    count++;
                }
            }
        }

        return count;
    }
}