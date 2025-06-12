class Solution {
    public int romanToInt(String s) {
          
           HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);    // 1
        map.put('V', 5);    // 5
        map.put('X', 10);   // 10
        map.put('L', 50);   // 50
        map.put('C', 100);  // 100
        map.put('D', 500);  // 500
        map.put('M', 1000); // 1000

        int total = 0;

        // Step 2: Loop through the string
        for (int i = 0; i < s.length(); i++) {
            int current = map.get(s.charAt(i));  // current symbol value

            // Step 3: Check if next symbol is larger (for subtraction cases like IV, IX)
            if (i < s.length() - 1 && current < map.get(s.charAt(i + 1))) {
                total -= current;  // subtract if smaller than next
            } else {
                total += current;  // otherwise, just add
            }
        }

        return total;
    }
}