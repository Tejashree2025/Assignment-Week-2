class Solution {
    public int[][] ShortestDistance(int[][] matrix) {
        // Code here
         int n = matrix.length, m = matrix[0].length;
        int[][] ans = new int[n][m];

        if (!ratMaze(matrix, ans, 0, 0)) {
            return new int[][]{{-1}};
        }

        return ans;
    }

    private boolean withinBoundary(int i, int j, int[][] matrix) {
        return i < matrix.length && j < matrix[0].length && matrix[i][j] != 0;
    }

    private boolean ratMaze(int[][] matrix, int[][] ans, int i, int j) {
        int n = matrix.length, m = matrix[0].length;

        if (i == n - 1 && j == m - 1) {
            ans[i][j] = 1;
            return true;
        }

        if (withinBoundary(i, j, matrix)) {
            ans[i][j] = 1;

            for (int step = 1; step <= matrix[i][j]; step++) {
                // Try moving right
                if (ratMaze(matrix, ans, i, j + step)) return true;
                // Try moving down
                if (ratMaze(matrix, ans, i + step, j)) return true;
            }

            // Backtrack
            ans[i][j] = 0;
        }

        return false;
    }
}
    