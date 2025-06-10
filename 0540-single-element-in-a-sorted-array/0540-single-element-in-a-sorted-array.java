class Solution {
    public int singleNonDuplicate(int[] nums) {
      int start = 0;
    int end = nums.length - 1;

    while (start < end) {
        int mid = start + (end - start) / 2;

        // Ensure mid is even, because pairs should start at even indices
        if (mid % 2 == 1) {
            mid--; // make mid even
        }

        // If the pair is valid, unique element is after mid
        if (nums[mid] == nums[mid + 1]) {
            start = mid + 2;
        } else {
            // Unique element is at or before mid
            end = mid;
        }
    }

    // When start == end, we've found the unique element
    return nums[start];
}
}
