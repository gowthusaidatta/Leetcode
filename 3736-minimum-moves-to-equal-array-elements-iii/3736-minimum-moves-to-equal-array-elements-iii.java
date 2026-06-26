class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int n=nums[nums.length-1],moves=0;
        for(int i=0;i<nums.length-1;i++){
            int sum=n-nums[i];
            moves+=sum;
        }
        return moves;
    }
}