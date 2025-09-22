class Solution {
   
    private long comb2(long x) {
        if (x < 0) return 0;
        return x * (x - 1) / 2;
    }

    public long distributeCandies(int n, int limit) {
        long total = comb2(n + 2);                 
        long subtract = 3 * comb2(n - limit + 1);  
        long addBack = 3 * comb2(n - 2 * limit);   
        long subtractAll = comb2(n - 3 * limit - 1); 

        return total - subtract + addBack - subtractAll;
    }
}
