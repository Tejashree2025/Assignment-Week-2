class Solution {
   private int countSubarraysWithSumAtMost(int[] nums, int goal) {
        if (goal < 0) return 0; // Edge case

        int left = 0, right = 0;
        int sum = 0;
        int count = 0;

        while (right < nums.length) {
            sum += nums[right];

            while (sum > goal) {
                sum -= nums[left];
                left++;
            }

            // Number of subarrays ending at 'right' with sum ≤ goal
            count += right - left + 1;
            right++;
        }

        return count;
    }

    public int numSubarraysWithSum(int[] nums, int goal) {
        return countSubarraysWithSumAtMost(nums, goal) -
               countSubarraysWithSumAtMost(nums, goal - 1);
    }
}