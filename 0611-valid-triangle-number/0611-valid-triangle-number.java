class Solution {
    public int triangleNumber(int[] nums) {
         Arrays.sort(nums);
        int count = 0, n = nums.length;

        for (int k = n - 1; k >= 2; k--) {
            int i = 0, j = k - 1;
            while (i < j) {
                if (nums[i] + nums[j] > nums[k]) {
                    count += (j - i); // all pairs from i..j-1 valid
                    j--;
                } else {
                    i++;
                }
            }
        }
        return count;
    }
}