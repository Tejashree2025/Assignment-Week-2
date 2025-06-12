class Solution {
    public int smallestDistancePair(int[] nums, int k) {

           Arrays.sort(nums);
        int n = nums.length;
        int low = 0;
        int high = nums[n - 1] - nums[0];  // max possible distance

        while (low < high) {
            int mid = low + (high - low) / 2;

            // Count pairs with distance <= mid
            int count = countPairs(nums, mid);

            if (count < k) {
                low = mid + 1; // Not enough pairs, need bigger distances
            } else {
                high = mid; // Try smaller distances
            }
        }

        return low;
    }

    // Helper function to count how many pairs have distance <= mid
    private int countPairs(int[] nums, int maxDist) {
        int count = 0;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            while (nums[right] - nums[left] > maxDist) {
                left++;
            }
            count += right - left;
        }

        return count;
    }
}
