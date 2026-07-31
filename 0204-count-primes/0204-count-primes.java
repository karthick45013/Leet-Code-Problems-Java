class Solution {
    public int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }
        int[] prime = new int[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (prime[i] == 0) {
                count++;
                for (int j = i + i; j < n; j += i) {
                    prime[j] = 1;
                }
            }
        }
        return count;
    }
}