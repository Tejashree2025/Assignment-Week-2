// User function Template for Java
class Solution {
    public static int aggressiveCows(int[] stalls, int k) {
        // code here
       Arrays.sort(stalls); // Sort stall positions first

    int n = stalls.length;
    int left = 1;                    // Minimum distance possible
    int right = stalls[n - 1] - stalls[0]; // Maximum distance possible
    int result = 0;                  // Store best minimum distance

    while (left <= right) {
        int mid = (left + right) / 2; // Try this distance
        int count = 1;                 // Place first cow in first stall
        int lastPos = stalls[0];       // Position of last placed cow

        // Try to place cows with at least 'mid' distance apart
        for (int i = 1; i < n; i++) {
            if (stalls[i] - lastPos >= mid) {
                count++;               // Place another cow here
                lastPos = stalls[i];
            }
        }

        // If we placed at least k cows with distance mid,
        // try for bigger distance
        if (count >= k) {
            result = mid;
            left = mid + 1;
        } else {
            // Otherwise, try smaller distance
            right = mid - 1;
        }
    }

    return result;
}
}