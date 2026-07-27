class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int prd=(nums[n-1]-1)*(nums[n-2]-1);
        // int prd2=(nums[0]-1)*(nums[n-1]-1);
        // return Math.max(prd,prd2);
        return prd;
        
    }
}