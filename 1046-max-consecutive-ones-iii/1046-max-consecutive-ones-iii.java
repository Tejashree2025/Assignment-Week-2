class Solution {
    public int longestOnes(int[] nums, int k) {
         int maxLen = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int zeroCount = 0;
            for (int j = i; j < n; j++) {
                if (nums[j] == 0) {
                    zeroCount++;
                }
                if (zeroCount > k) {
                    break;  // Too many zeros, stop expanding this subarray
                }
                maxLen = Math.max(maxLen, j - i + 1);
            }
        }

        return maxLen;
    }
}
   