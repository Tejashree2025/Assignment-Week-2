// User function Template for Java

class Solution {
    public List<String> AllPossibleStrings(String s) {
        // Code here
       List<String> result = new ArrayList<>();
        generateSubsequences(s, 0, "", result);
        Collections.sort(result); // Sort the list in lexicographic order
        return result;
    }

    // Helper method to generate all subsequences
    private void generateSubsequences(String s, int index, String current, List<String> result) {
        if (index == s.length()) {
            if (!current.isEmpty()) {
                result.add(current);
            }
            return;
        }

        // Include the current character
        generateSubsequences(s, index + 1, current + s.charAt(index), result);

        // Exclude the current character
        generateSubsequences(s, index + 1, current, result);
    }  
       
    }
