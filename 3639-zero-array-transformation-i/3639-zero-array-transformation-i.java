class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] coverage = new int[n];

        for (int[] q : queries) {
            int l = q[0], r = q[1];
            coverage[l] += 1;
            if (r + 1 < n) coverage[r + 1] -= 1;
        }

        // Convert to prefix sum
        for (int i = 1; i < n; i++) {
            coverage[i] += coverage[i - 1];
        }

        // Check feasibility
        for (int i = 0; i < n; i++) {
            if (nums[i] > coverage[i]) return false;
        }

        return true;
    }
}
