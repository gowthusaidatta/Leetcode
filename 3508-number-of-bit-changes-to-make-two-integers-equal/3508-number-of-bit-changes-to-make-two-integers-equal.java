class Solution {
    public int minChanges(int n, int k) {
        if ((n | k) != n) return -1;

        // Count bits where n has 1 and k has 0
        int toFlip = n & (~k);
        return Integer.bitCount(toFlip);
    }
}