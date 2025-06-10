class Solution {
    public int findMin(int[] nums) {

        int start = 0;
    int end = nums.length - 1;

    while (start < end) {
        int mid = start + (end - start) / 2;

        if (nums[mid] < nums[end]) {
            end = mid; // min is in the left half including mid
        } else if (nums[mid] > nums[end]) {
            start = mid + 1; // min is in the right half excluding mid
        } else {
            // nums[mid] == nums[end], can't decide direction, reduce end
            end--;
        }
    }

    // At the end of loop, start == end, pointing to the minimum element
    return nums[start];
    }
}