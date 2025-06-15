class Solution {
    public List<Integer> findDuplicates(int[] nums) {

         List<Integer> duplicates = new ArrayList<>();
        Arrays.sort(nums);  // Sort the array first

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                // To avoid adding the same duplicate multiple times
                if (duplicates.isEmpty() || duplicates.get(duplicates.size() - 1) != nums[i]) {
                    duplicates.add(nums[i]);
                }
            }
        }

        return duplicates;
    }
}
        