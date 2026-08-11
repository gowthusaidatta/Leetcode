class Solution {
    public int missingInteger(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int sum=0;
         for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        sum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1) sum+=nums[i];
            else break;
            
           
        }
        for(int i=0;i<nums.length;i++){
            if(set.contains(sum)){
                sum++;
            }
        }
        return sum;
    }
}