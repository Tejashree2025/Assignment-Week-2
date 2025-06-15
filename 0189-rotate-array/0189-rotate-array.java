class Solution {
    public void rotate(int[] nums, int k) {
           int n = nums.length;
    k = k % n; // Normalize if k > n

    reverse(nums, 0, n - 1);      // Step 1: Reverse the whole array
    reverse(nums, 0, k - 1);      // Step 2: Reverse the first k elements
    reverse(nums, k, n - 1);      // Step 3: Reverse the remaining n-k elements
}


private void reverse(int[] arr, int start, int end) {
    while (start < end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
}
    }
