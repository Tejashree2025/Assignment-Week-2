class Solution {
   public int nthMagicalNumber(int n, int a, int b) {
        int MOD = 1_000_000_007;

        // Find Least Common Multiple (LCM) using GCD
        long lcm = lcm(a, b);

        // Binary search range: the answer lies between 1 and n * min(a, b)
        long low = 1;
        long high = (long) n * Math.min(a, b);

        while (low < high) {
            long mid = (low + high) / 2;

            // Count how many magical numbers are <= mid
            long count = mid / a + mid / b - mid / lcm;

            if (count < n) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return (int)(low % MOD);
    }

    // Helper function to calculate LCM using GCD
    private long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }

    // Helper function to calculate GCD (Greatest Common Divisor)
    private long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}

