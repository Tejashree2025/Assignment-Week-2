class Solution {
    public static void convertToWave(int[] arr) {
        // code here
        for (int i = 0; i < arr.length - 1; i += 2) {
        // Swap adjacent elements
        int temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;
    }
}
    }

