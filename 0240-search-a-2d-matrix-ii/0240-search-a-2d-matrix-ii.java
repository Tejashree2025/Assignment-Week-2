class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

         int n = matrix.length;
    int m = matrix[0].length;
    int row = 0;
    int col = m - 1;

    while (row < n && col >= 0) {
        if (matrix[row][col] == target) {
            return true;  // Found the target
        } else if (matrix[row][col] < target) {
            row++;        // Move down to find bigger values
        } else {
            col--;        // Move left to find smaller values
        }
    }

    return false;  // Target not found
}
        
    }
