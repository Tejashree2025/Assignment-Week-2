class Solution {
    public int findKthNumber(int m, int n, int k) {
        
  int low = 1;
    int high = m * n;

    while (low < high) {
        int mid = low + (high - low) / 2;

        // Count how many numbers are less than or equal to mid
        int count = 0;
        for (int i = 1; i <= m; i++) {
            count += Math.min(n, mid / i); // number of elements in row i <= mid
        }

        if (count < k) {
            low = mid + 1;
        } else {
            high = mid;
        }
    }

    return low;
}
}