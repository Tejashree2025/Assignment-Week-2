class Solution {
    public int kthSmallest(int[][] matrix, int k) {

     int n=matrix.length;

     int low=matrix[0][0];
     int high=matrix[n-1][n-1];

     while(low < high){
        int mid=low+(high-low)/2;

        // Count how many elements are less than or equal to mid

        int count=0;
        int row=n-1;
        int col=0;

        while(row>=0 && col<n){
            if(matrix[row][col]<=mid){
                count=count+row+1; // this line is to simplify , instead of going to every row and col as row 0 and col1 is sorted and it will be lessaer than mid so, we count row+1 and strore in count
                   col++;
            }else{
            row--;
            }
        }
        if(count<k){
            low=mid+1;
        }else{
        high=mid;
        }
     }
     return low;

    }
}
