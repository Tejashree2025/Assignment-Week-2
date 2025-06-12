// User function Template for Java

class Solution {
    public long subarraySum(int[] arr) {
        // code here
           int n = arr.length;
    long totalSum = 0;
    long MOD = 1000000007;

    for (int i = 0; i < n; i++) {
        long contribution = ((long) arr[i]) * (i + 1) * (n - i);
        contribution %= MOD; // take mod at each step to avoid overflow
        totalSum = (totalSum + contribution) % MOD;
    }

    return totalSum;
    }
}