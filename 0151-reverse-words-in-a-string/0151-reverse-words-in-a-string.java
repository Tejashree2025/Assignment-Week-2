class Solution {
    public String reverseWords(String s) {
          s = s.trim().replaceAll("\\s+", " ");

    // Split string into words
    String[] words = s.split(" ");

    // Reverse the words in a simple loop
    String result = "";
    for (int i = words.length - 1; i >= 0; i--) {
        result += words[i];
        if (i != 0) {
            result += " ";
        }
    }

    return result;
}
}