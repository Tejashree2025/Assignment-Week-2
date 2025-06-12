class Solution {
    int missingNum(int arr[]) {
        // code here
         int n = arr.length + 1;  // total elements expected
        long totalSum = (long) n * (n + 1) / 2;  // Use long to avoid overflow

        long actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        return (int) (totalSum - actualSum);  // cast back to int for return
    }
}