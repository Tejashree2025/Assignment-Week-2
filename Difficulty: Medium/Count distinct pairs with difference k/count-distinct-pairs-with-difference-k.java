// User function Template for Java

class Solution {
    public int TotalPairs(int[] nums, int k) {
        // Code here
       int n = nums.length;
        int i = 0, j = 1, count = 0;

        Arrays.sort(nums);

        while (j < n) {
            int diff = nums[j] - nums[i];
            if (diff == k) {
                count++;
                i++;
                j++;
                while (i < n && nums[i] == nums[i - 1])
                    i++;
                while (j < n && nums[j] == nums[j - 1])
                    j++;
            }
            else if (diff < k) {
                j++;
            }
            else {
                i++;
            }
            if (i >= j) {
                j++;
            }
        }

        return count;
    }
}