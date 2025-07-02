class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        // Hours range from 0 to 11
        // Minutes range from 0 to 59
         List<String> result = new ArrayList<>();
        for (int h = 0; h < 12; h++) {
            for (int m = 0; m < 60; m++) {
                // Count how many 1s are in the binary representation of h and m
                if (Integer.bitCount(h) + Integer.bitCount(m) == turnedOn) {
                    // Format time correctly
                    result.add(String.format("%d:%02d", h, m));
                }
            }
        }

        return result;
    }
    }
