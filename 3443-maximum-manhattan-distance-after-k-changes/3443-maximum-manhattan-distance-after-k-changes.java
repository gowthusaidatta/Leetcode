class Solution {
    public int maxDistance(String s, int k) {
        return Math.max(
                Math.max(solve(s, k, 'N', 'E'), solve(s, k, 'N', 'W')),
                Math.max(solve(s, k, 'S', 'E'), solve(s, k, 'S', 'W'))
        );
    }

    private int solve(String s, int k, char d1, char d2) {
        int dist = 0;
        int ans = 0;

        for (char ch : s.toCharArray()) {
            if (ch == d1 || ch == d2) {
                dist++;
            } else if (k > 0) {
                dist++;
                k--;
            } else {
                dist--;
            }

            ans = Math.max(ans, dist);
        }

        return ans;
    }
}