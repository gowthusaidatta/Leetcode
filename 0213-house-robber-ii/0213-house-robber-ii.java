class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)return nums[0];
        int case1=robl(nums,0,n-2);
        int case2=robl(nums,1,n-1);
        return Math.max(case1,case2);
    }
    private int robl(int[] nums,int start, int end){
        int n=end-start+1;
        int[] dp=new int[n];
        for(int i=0;i<n;i++){
            if(i==0){
                dp[i]=nums[start++];
                continue;
            }
            if(i==1){
                dp[i]=Math.max(nums[start-1],nums[start]);
                start++;
                continue;
            }
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[start++]);
            
        }
        return dp[n-1];
    }
}