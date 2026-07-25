class Solution {
    public int[] productExceptSelf(int[] nums) {
        int arr[]=new int[nums.length];
        int prd=1,prd1=1;
        for(int i=0;i<nums.length;i++){
            arr[i]=prd;
            prd*=nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
            arr[i]*=prd1;
            prd1*=nums[i]; 
        }
        return arr;
    }
}