// User function Template for Java

class Solution {
    
  
 
    int countPairs(int arr[], int target) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : arr) {
            int complement = target - num;

            if (map.containsKey(complement)) {
                count += map.get(complement); // Add how many times complement appeared before
            }

            // Store current number in the map
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return count;
    }
}