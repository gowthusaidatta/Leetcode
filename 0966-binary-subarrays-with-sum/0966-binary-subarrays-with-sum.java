class Solution {
    private int solve(int[] nums, int k, int n) {
        if (k < 0) return 0;
        int left=0,sum=0,cnt=0;

        for (int i=0;i<n;i++){
            sum +=nums[i];
            while(sum>k && left<=i){
                sum -= nums[left++];
            }
            cnt+=(i-left+1);
        }
        return cnt;
    }

    public int numSubarraysWithSum(int[] nums, int goal) {
        int n=nums.length;
        return solve(nums,goal,n) -solve(nums,goal-1,n);
    }
}
