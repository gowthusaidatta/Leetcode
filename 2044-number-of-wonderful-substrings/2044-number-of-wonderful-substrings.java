class Solution {
    public long wonderfulSubstrings(String word) {
        int n = word.length();
        long result = 0;
        int mask = 0; // prefix mask
        long[] count = new long[1 << 10]; // 1024 possible masks
        count[0] = 1; // empty prefix
        
        for (char c : word.toCharArray()) {
            int bit = c - 'a';
            mask ^= (1 << bit); // toggle bit for this character
            
            // Case 1: same mask seen before
            result += count[mask];
            
            // Case 2: masks that differ by exactly 1 bit
            for (int i = 0; i < 10; i++) {
                result += count[mask ^ (1 << i)];
            }
            
            // Update count of current mask
            count[mask]++;
        }
        
        return result;
    }
}
