class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        // code here
         HashSet<Integer> set = new HashSet<>();
          List<Integer> duplicates = new ArrayList<>();

    for (int num : arr) {
        if (!set.add(num)) {
            duplicates.add(num);
        }
    }
    return duplicates;
    }
}