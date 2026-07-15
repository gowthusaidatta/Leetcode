class Solution {
    public int gcdOfOddEvenSums(int n) {
        int es=n*(n-1);
        int os=n*n;
        
        return gcd(es,os);
    }
    private int gcd(int a, int b) {
    a = Math.abs(a);
    b = Math.abs(b);

    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }

    return a;
}
}