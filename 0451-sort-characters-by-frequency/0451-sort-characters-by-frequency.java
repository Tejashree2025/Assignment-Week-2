class Solution {
    public String frequencySort(String s) {
      int[] freq = new int[256]; // For all ASCII characters

        // Step 1: Count frequency of each character
        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        StringBuilder result = new StringBuilder();

        // Step 2: Repeat for the length of the string
        for (int i = 0; i < s.length(); i++) {
            int maxFreq = 0;
            char maxChar = 0;

            // Step 3: Find character with max frequency
            for (int j = 0; j < 256; j++) {
                if (freq[j] > maxFreq) {
                    maxFreq = freq[j];
                    maxChar = (char) j;
                }
            }

            // Step 4: Append maxChar maxFreq times to result
            for (int k = 0; k < maxFreq; k++) {
                result.append(maxChar);
            }

            // Step 5: Mark character as used
            freq[maxChar] = 0;
        }

        return result.toString();
    }
}